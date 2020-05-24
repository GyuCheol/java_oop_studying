package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Post {

    private int authorId;
    private int[] reaction = new int[5];
    private String title;
    private String content;
    private OffsetDateTime modifiedDateTime = OffsetDateTime.now();
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private ArrayList<String> tagList = new ArrayList<>();
    private ArrayList<Comment> commentList = new ArrayList<>();

    public Post(int authorId, String title, String content) {
        this.authorId = authorId;
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
        modifiedDateTime = OffsetDateTime.now();
    }

    public void setContent(String content) {
        this.content = content;
        modifiedDateTime = OffsetDateTime.now();
    }

    public void addTag(String tag) {
        tagList.add(tag);
    }

    public void addComment(int authorId, String content) {
        commentList.add(new Comment(authorId, content));
    }

    public void addReactionType(ReactionType type) {
        reaction[type.getNumber()]++;
    }

    public void removeReactionType(ReactionType type) {
        reaction[type.getNumber()]--;
    }

    public ArrayList<Comment> getCommentList() {

        // this.commentList.sort((a, b) -> );

        return this.commentList;
    }

}
