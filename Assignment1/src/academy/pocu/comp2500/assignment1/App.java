package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        // registry.registerPostAdder("Foo", "bar");

        registry.registerBlogCreator("Blog");
        registry.registerPostAdder("Blog", "addPost");

        registry.registerPostTitleUpdater("Post", "setTitle");
        registry.registerPostBodyUpdater("Post", "setContent");
        registry.registerPostTagAdder("Post", "addTag");
        registry.registerCommentAdder("Post", "addComment");
        registry.registerReactionAdder("Post", "addReactionType");
        registry.registerReactionRemover("Post", "removeReactionType");
        registry.registerCommentListGetter("Post", "getCommentList");

        registry.registerCommentUpdater("Comment", "setContent");
        registry.registerCommentUpvoter("Comment", "upVote");
        registry.registerCommentDownvoter("Comment", "downVote");
        registry.registerSubcommentAdder("Comment", "addSubComment");
        registry.registerSubCommentListGetter("Comment", "getSubCommentList");

        registry.registerSubcommentUpdater("Comment", "setContent");
        registry.registerSubcommentUpvoter("Comment", "upVote");
        registry.registerSubcommentDownvoter("Comment", "downVote");

        // 미구현
        registry.registerPostOrderSetter("Blog", "setPostOrder");
        registry.registerTagFilterSetter("Blog", "setTagFilter");
        registry.registerAuthorFilterSetter("Blog", "setAuthorFilter");
        registry.registerPostListGetter("Blog", "getPostList");

    }
}
