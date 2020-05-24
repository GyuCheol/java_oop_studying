package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Comment {

    private int authorId;
    private int upvote = 0;
    private int downvote = 0;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private String content;
    private ArrayList<Comment> subCommentList = new ArrayList<>();

    public Comment(int authorId, String content) {
        this.authorId = authorId;
        setContent(content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addSubComment(int authorId, String content) {
        subCommentList.add(new Comment(authorId, content));
    }

    public void upVote() {
        this.upvote++;
    }

    public void downVote() {
        this.downvote++;
    }

    public ArrayList<Comment> getSubCommentList() {
        return this.subCommentList;
    }

}
