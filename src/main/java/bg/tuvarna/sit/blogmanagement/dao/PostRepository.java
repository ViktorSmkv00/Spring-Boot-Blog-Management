package bg.tuvarna.sit.blogmanagement.dao;

import bg.tuvarna.sit.blogmanagement.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postRepository")
public class PostRepository implements PostDao{
    private static PostRepository instance;
    private static List<Post> posts = new ArrayList<>();

    @Override
    public int insertPost(UUID id, Post post) {
        posts.add(new Post(id, post.getTitle(), post.getContent()));
        return 0;
    }

    @Override
    public List<Post> showAllPosts() {
        return posts;
    }

    @Override
    public List<Post> getPostByContent(String content) {
        List<Post> matchingPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getContent().contains(content)) {
                matchingPosts.add(post);
            }
        }
        return matchingPosts;
    }



    @Override
    public Optional<Post> getPostById(UUID id) {
        return posts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePostById(UUID id) {
        Optional<Post> postMaybe = getPostById(id);
        if (postMaybe.isEmpty()){
            return 0;
        }
        posts.remove(postMaybe.get());
        return 1;
    }

}
