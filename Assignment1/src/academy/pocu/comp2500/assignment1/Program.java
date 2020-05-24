package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class Program {

    public static void main(String[] args) throws InterruptedException {
	    // write your code here

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

        Blog blog = new Blog();
        
        // post 2개 추가
        blog.addPost(new Post("ABC", "이것은1", "포스트"));
        Thread.sleep(100);
        blog.addPost(new Post("ABD", "이것은2", "포스트2"));

        blog.getPostList().get(0).addTag("A");
        blog.getPostList().get(1).addTag("B");


        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

        blog.setTagFilter("A");

        for (Post post : blog.getPostList()) {
            System.out.println(post.getTitle());
        }

    }
}
