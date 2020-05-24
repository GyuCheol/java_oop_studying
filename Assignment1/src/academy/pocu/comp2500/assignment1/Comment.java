package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Comment {

    private int commentId;
    private int upvote = 0;
    private int downvote = 0;

    private User user;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private String body;
    private ArrayList<Comment> subCommentList = new ArrayList<>();
    private HashSet<String> nameSet = new HashSet<>();

    public Comment(int commentId, User user, String body) {
        this.commentId = commentId;
        this.user = user;
        updateComment(user, body);
    }

    public int getCommentId() {
        return this.commentId;
    }

    public User getUser() {
        return this.user;
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

    public void updateComment(User user, String body) {
        if (this.user.getUserId() == user.getUserId()) {
            this.body = body;
        }
    }

    public void addComment(Comment comment) {
        this.subCommentList.add(comment);
    }

    public void upVote(User user) {
        if (nameSet.contains(user.getName()) == false) {
            this.upvote++;
            nameSet.add(user.getName());
        }
    }

    public void downVote(User user) {
        if (nameSet.contains(user.getName()) == false) {
            this.downvote++;
            nameSet.add(user.getName());
        }
    }

    public ArrayList<Comment> getCommentList() {
        ArrayList<Comment> list = new ArrayList<>();

        this.subCommentList.stream().sorted((a, b) -> {
            return (b.getUpvote() - b.getDownvote()) - (a.getUpvote() - a.getDownvote());
        }).forEach(x -> list.add(x));

        return list;
    }

}
