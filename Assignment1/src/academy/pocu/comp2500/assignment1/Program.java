package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class Program {

    public static void main(String[] args) throws InterruptedException {
	    // write your code here

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

        Blog blog = new Blog();

        User user1 = new User(1, "ABC");
        User user2 = new User(2, "ABC");

        Post post1 = new Post(1, user1, "이것은1", "포스트");
        Post post2 = new Post(2,user2, "이것은2", "포스트2");

        // post 2개 추가
        blog.addPost(post1);
        Thread.sleep(100);
        blog.addPost(post2);

        Comment comment1 = new Comment(1, user1, "hi1");
        Comment comment2 = new Comment(2, user1, "hi2");
        Comment comment3 = new Comment(3, user2, "hi3");
        Comment comment4 = new Comment(3, user2, "hi4");

        //comment2.upVote(user);
        //comment1.downVote(user);
        comment4.upVote(user1);

        blog.setAuthorFilter(user1);
        post1.addComment(comment1);
        post1.addComment(comment2);

        comment1.addComment(comment3);
        comment1.addComment(comment4);

        post1.addTag("ABC");
        post1.addTag("ABD");
        post2.addTag("BCC");

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        blog.addTagFilter(null);
        blog.setAuthorFilter(null);

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        for (Comment comment : blog.getPostList().get(0).getCommentList()) {
            System.out.println(comment.getBody());
        }

        for (Comment comment : blog.getPostList().get(0).getCommentList().get(0).getCommentList()) {
            System.out.println(comment.getBody());
        }

    }
}
