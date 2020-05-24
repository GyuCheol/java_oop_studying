package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Blog {

    private String filteringTag;
    private int filteringAuthorId;

    private ArrayList<Post> postList = new ArrayList<>();
    private PostOrderType postOrderType = PostOrderType.CREATED_DESC;

    public void addPost(int authorId, String title, String content) {
        postList.add(new Post(authorId, title, content));
    }

    public void setTagFilter(String tag) {
        this.filteringTag = tag;
    }

    public void setAuthorFilter(int authorId) {
        this.filteringAuthorId = authorId;
    }

    public void setPostOrder(PostOrderType type) {
        this.postOrderType = type;
    }

    public ArrayList<Blog> getPostList() {
        ArrayList<Blog> list = new ArrayList<>();

        return list;
    }

}
