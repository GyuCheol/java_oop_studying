package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program {

    public static void main(String[] args) throws InterruptedException {
	    // write your code here

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

        Blog blog = new Blog();

        User user = new User(1, "ABC");

        // post 2개 추가
        blog.addPost(new Post(1, user, "이것은1", "포스트"));
        Thread.sleep(100);
        blog.addPost(new Post(2,user, "이것은2", "포스트2"));

        Comment comment1 = new Comment(1, user, "hi1");
        Comment comment2 = new Comment(2, user, "hi2");

        //comment2.upVote(user);
        //comment1.downVote(user);

        blog.getPostList().get(0).addComment(comment1);
        blog.getPostList().get(0).addComment(comment2);

        blog.getPostList().get(0).addTag("ABC");
        blog.getPostList().get(0).addTag("ABD");
        blog.getPostList().get(1).addTag("BCC");

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        List<String> tagList = new ArrayList<>();

        tagList.add("ABC");
        tagList.add("BCC");

        blog.setTagFilter(tagList);

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        for (Comment comment : blog.getPostList().get(0).getCommentList()) {
            System.out.println(comment.getBody());
        }

    }
}
