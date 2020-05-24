package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Blog {

    private List<String> filteringTag;
    private String filteringAuthorName;

    private ArrayList<Post> postList = new ArrayList<>();
    private PostOrderType sortingType = PostOrderType.CREATED_DESC;

    public void addPost(Post post) {
        postList.add(post);
    }

    public void setTagFilter(List<String> tagOrNull) {
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
                tag = filteringTag.stream().filter(t -> post.isContainTag(t)).findFirst().isPresent();
            }

            if (this.filteringAuthorName != null && this.filteringAuthorName.equals("") == false) {
                author = post.getUser().getName().equals(this.filteringAuthorName);
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
