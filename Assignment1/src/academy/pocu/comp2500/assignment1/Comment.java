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

    private String content;
    private ArrayList<Comment> subCommentList = new ArrayList<>();

    public Comment(int commentId, String authorName, String content) {
        this.commentId = commentId;
        this.authorName = authorName;
        setContent(content);
    }

    public String getContent() {
        return this.content;
    }

    public int getUpvote() {
        return this.upvote;
    }

    public int getDownvote() {
        return this.downvote;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addSubComment(String authorName, String content) {
        subCommentSerialId++;

        subCommentList.add(new Comment(subCommentSerialId, authorName, content));
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
