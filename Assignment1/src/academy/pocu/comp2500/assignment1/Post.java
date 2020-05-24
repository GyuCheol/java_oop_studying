package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Post {

    private int postId;
    private int[] reaction = new int[5];

    private User user;
    private String title;
    private String body;
    private OffsetDateTime modifiedDateTime = OffsetDateTime.now();
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private HashSet<String> tagSet = new HashSet<>();
    private ArrayList<Comment> commentList = new ArrayList<>();

    public Post(int postId, User user, String title, String body) {
        this.postId = postId;
        this.user = user;
        this.title = title;
        this.body = body;
    }

    public int getPostId() {
        return this.postId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isContainTag(String tag) {
        return tagSet.stream().filter(x -> x.equals(tag)).findFirst().isPresent();
    }

    public ArrayList<String> getTag() {
        ArrayList<String> list = new ArrayList<>();

        tagSet.stream().forEach(tag -> list.add(tag));

        return list;
    }

    public String getBody() {
        return this.body;
    }

    public User getUser() {
        return this.user;
    }

    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }

    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    public void setTitle(String title) {
        this.title = title;
        modifiedDateTime = OffsetDateTime.now();
    }

    public void setBody(String body) {
        this.body = body;
        modifiedDateTime = OffsetDateTime.now();
    }

    public void addTag(String tag) {
        if (tag != null && tagSet.contains(tag) == false) {
            tagSet.add(tag);
        }
    }

    public void addComment(Comment comment) {
        commentList.add(comment);
    }

    public void addReaction(ReactionType reactionType) {
        reaction[reactionType.getIndex()]++;
    }

    public void removeReaction(ReactionType reactionType) {
        reaction[reactionType.getIndex()]--;
    }

    public int getReaction(ReactionType reactionType) {
        return reaction[reactionType.getIndex()];
    }

    public ArrayList<Comment> getCommentList() {
        ArrayList<Comment> list = new ArrayList<>();

        this.commentList.stream().sorted((a, b) -> {
            return (b.getUpvote() - b.getDownvote()) - (a.getUpvote() - a.getDownvote());
        }).forEach(x -> list.add(x));

        return list;
    }

}
