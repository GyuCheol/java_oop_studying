package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Post {

    private int commentSerialId = 0;
    private int postId;
    private int[] reaction = new int[5];

    private String authorName;
    private String title;
    private String content;
    private OffsetDateTime modifiedDateTime = OffsetDateTime.now();
    private OffsetDateTime createdDateTime = OffsetDateTime.now();

    private ArrayList<String> tagList = new ArrayList<>();
    private ArrayList<Comment> commentList = new ArrayList<>();

    public Post(int postId, String authorName, String title, String content) {
        this.postId = postId;
        this.authorName = authorName;
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isContainTag(String tag) {
        return tagList.stream().filter(x -> x.contains(tag)).findFirst().isPresent();
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthorName() {
        return this.authorName;
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

    public void setContent(String content) {
        this.content = content;
        modifiedDateTime = OffsetDateTime.now();
    }

    public void addTag(String tag) {
        if (tag != null) {
            tagList.add(tag);
        }
    }

    public void addComment(String authorName, String content) {

        commentSerialId++;
        commentList.add(new Comment(commentSerialId, authorName, content));
    }

    public void addReaction(int reactionId) {
        reaction[reactionId]++;
    }

    public void removeReaction(int reactionId) {
        reaction[reactionId]--;
    }

    public int getReaction(int reactionId) {
        return reaction[reactionId];
    }

    public ArrayList<Comment> getCommentList() {
        ArrayList<Comment> list = new ArrayList<>();

        this.commentList.stream().sorted((a, b) -> {
            return -Integer.compare((a.getUpvote() - a.getDownvote()), (b.getUpvote() - b.getDownvote()));
        }).forEach(x -> list.add(x));

        return list;
    }

}
