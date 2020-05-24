package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Blog {

    private User filteringUser;
    private ArrayList<String> filteringTag= new ArrayList<>();
    private ArrayList<Post> postList = new ArrayList<>();
    private PostOrderType sortingType = PostOrderType.CREATED_DESC;

    public void addPost(Post post) {
        postList.add(post);
    }

    public void addTagFilter(String tagOrNull) {
        if (tagOrNull != null) {
            this.filteringTag.add(tagOrNull);
        } else {
            this.filteringTag.clear();
        }
    }

    public void setAuthorFilter(User user) {
        this.filteringUser = user;
    }

    public void setPostOrder(PostOrderType sortingType) {
        this.sortingType = sortingType;
    }

    public ArrayList<Post> getPostList() {
        ArrayList<Post> list = new ArrayList<>();

        postList.stream().filter(post -> {
            boolean tag = true;
            boolean author = true;

            if (this.filteringTag.size() > 0) {
                tag = filteringTag.stream().filter(t -> post.isContainTag(t)).findFirst().isPresent();
            }

            if (this.filteringUser != null) {
                author = post.getUser().getUserId() == this.filteringUser.getUserId();
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
