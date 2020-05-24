package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Comment {

    private int subCommentSerialId = 0;
    private int commentId;
    private int upvote = 0;
    private int downvote = 0;

    private String authorName;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private String body;
    private ArrayList<Comment> subCommentList = new ArrayList<>();

    public Comment(int commentId, String authorName, String body) {
        this.commentId = commentId;
        this.authorName = authorName;
        setBody(body);
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    public String getBody() {
        return this.body;
    }

    public int getUpvote() {
        return this.upvote;
    }

    public int getDownvote() {
        return this.downvote;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void addSubComment(String authorName, String body) {
        subCommentSerialId++;

        subCommentList.add(new Comment(subCommentSerialId, authorName, body));
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
