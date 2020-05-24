package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Comment {

    private int subCommentSerialId = 0;
    private int commentId;
    private int upvote = 0;
    private int downvote = 0;

    private String authorName;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private String body;
    private ArrayList<Comment> subCommentList = new ArrayList<>();
    private HashSet<String> nameSet = new HashSet<>();

    public Comment(int commentId, String authorName, String body) {
        this.commentId = commentId;
        this.authorName = authorName;
        setBody(body);
    }

    public int getCommentId() {
        return this.commentId;
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

    public void upVote(String name) {
        if (nameSet.contains(name) == false) {
            this.upvote++;
            nameSet.add(name);
        }
    }

    public void downVote(String name) {
        if (nameSet.contains(name) == false) {
            this.downvote++;
            nameSet.add(name);
        }
    }

    public ArrayList<Comment> getSubCommentList() {
        return this.subCommentList;
    }

}
