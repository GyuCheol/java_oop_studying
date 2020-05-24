package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Comment {
    private int upvote = 0;
    private int downvote = 0;

    private String authorName;
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private String body;
    private ArrayList<Comment> subCommentList = new ArrayList<>();
    private HashSet<String> nameSet = new HashSet<>();

    public Comment(String authorName, String body) {
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

    public void addSubComment(Comment subcomment) {
        subCommentList.add(subcomment);
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
