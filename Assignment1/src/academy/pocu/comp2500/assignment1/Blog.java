package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Blog {

    private int postSerialId = 0;

    private String filteringTag;
    private String filteringAuthorName;

    private ArrayList<Post> postList = new ArrayList<>();
    private PostOrderType sortingType = PostOrderType.CREATED_DESC;

    public void addPost(String authorName, String title, String content) {
        postSerialId++;

        postList.add(new Post(postSerialId, authorName, title, content));
    }

    public void setTagFilter(String tagOrNull) {
        this.filteringTag = tagOrNull;
    }

    public void setAuthorFilter(String authorNameOrNull) {
        this.filteringAuthorName = authorNameOrNull;
    }

    public void setPostOrder(PostOrderType sortingType) {
        this.sortingType = sortingType;
    }

    public ArrayList<Post> getPostList() {
        ArrayList<Post> list = new ArrayList<>();

        postList.stream().filter(post -> {
            boolean tag = true;
            boolean author = true;

            if (this.filteringTag != null && this.filteringTag.equals("") == false) {
                tag = post.isContainTag(this.filteringTag);
            }

            if (this.filteringAuthorName != null && this.filteringAuthorName.equals("") == false) {
                author = post.getAuthorName().contains(this.filteringAuthorName);
            }

            return tag && author;

        }).sorted((a, b) -> {

            switch (this.sortingType) {
                case CREATED_ASC:
                    return a.getCreatedDateTime().compareTo(b.getCreatedDateTime());
                case CREATED_DESC:
                    return -a.getCreatedDateTime().compareTo(b.getCreatedDateTime());
                case MODIFIED_ASC:
                    return a.getModifiedDateTime().compareTo(b.getModifiedDateTime());
                case MODIFIED_DESC:
                    return -a.getModifiedDateTime().compareTo(b.getModifiedDateTime());
                case TITLE_ASC:
                    return a.getTitle().compareTo(b.getTitle());
            }

            return 0;

        }).forEach(post -> list.add(post));

        return list;
    }

}
