package academy.pocu.comp2500.lab4;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class MemoryCache {
    private static int maxInstanceCount = 10;
    private static LinkedHashMap<String, MemoryCache> memCacheMap = new LinkedHashMap<>();

    private int maxEntryCount = 10;
    private EvictionPolicy policy = EvictionPolicy.LEAST_RECENTLY_USED;
    private LinkedHashMap<String, String> cacheMap = new LinkedHashMap<>();

    private Deque<String> deque = new ArrayDeque<>();
    private LinkedHashSet<String> lruSet = new LinkedHashSet<>();

    private MemoryCache() { }

    private static void clearInstance(int compareTo) {
        while (memCacheMap.size() > compareTo) {
            // LRU 가장 안쓴 최근 것 제거
            String oldKey = memCacheMap.keySet().iterator().next();

            memCacheMap.remove(oldKey);
        }
    }

    public static void setMaxInstanceCount(int count) {
        maxInstanceCount = count;
        clearInstance(maxInstanceCount);
    }

    public static MemoryCache getInstance(String key) {

        MemoryCache cache = null;

        // LRU 소거
        if (memCacheMap.containsKey(key) == false) {
            clearInstance(maxInstanceCount - 1);
            cache = new MemoryCache();
        } else {
            cache = memCacheMap.get(key);

            memCacheMap.remove(key);
        }
        memCacheMap.put(key, cache);

        return cache;
    }

    public static void clear() {
        memCacheMap.clear();
    }

    public void setEvictionPolicy(EvictionPolicy policy) {
        this.policy = policy;
    }

    public void addEntry(String key, String value) {

        if (cacheMap.containsKey(key)) {
            // 값만 변경하고, 다른 상태는 유지시킴.
            cacheMap.remove(key);
            cacheMap.put(key, value);
            updateLRU(key);
            return;
        }

        // Entry를 비워주고, 추가함.
        clearEntry(this.maxEntryCount - 1);

        cacheMap.put(key, value);
        deque.add(key);
        updateLRU(key);
    }

    private void updateLRU(String key) {
        if (lruSet.contains(key)) {
            lruSet.remove(key);
        }

        lruSet.add(key);
    }

    public String getEntryOrNull(String key) {

        String value = cacheMap.getOrDefault(key, null);

        if (value != null) {
            lruSet.remove(key);
            lruSet.add(key);
        }

        return value;
    }

    private void clearEntry(int compareSize) {

        while (cacheMap.size() > compareSize) {
            String key = null;

            switch (this.policy) {

                case LAST_IN_FIRST_OUT:
                    // Stack
                    key = deque.getLast();
                    break;
                case FIRST_IN_FIRST_OUT:
                    // Queue
                    key = deque.getFirst();
                    break;
                case LEAST_RECENTLY_USED:
                    // LRU
                    key = lruSet.iterator().next();
                    break;
            }

            deque.remove(key);
            lruSet.remove(key);
            cacheMap.remove(key);
        }
    }

    public void setMaxEntryCount(int count) {
        this.maxEntryCount = count;
        clearEntry(this.maxEntryCount);
    }

}
