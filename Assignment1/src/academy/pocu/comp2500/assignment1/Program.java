package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.HashSet;

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

        blog.getPostList().get(0).addTag("ABC");
        blog.getPostList().get(0).addTag("ABD");
        blog.getPostList().get(1).addTag("BCC");


        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        HashSet<String> tagSet = new HashSet<>();

        tagSet.add("ABC");

        blog.setTagFilter(tagSet);

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

    }
}
