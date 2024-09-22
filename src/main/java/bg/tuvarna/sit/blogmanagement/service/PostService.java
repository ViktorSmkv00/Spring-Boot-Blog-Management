package bg.tuvarna.sit.blogmanagement.service;

import bg.tuvarna.sit.blogmanagement.dao.PostRepository;
import bg.tuvarna.sit.blogmanagement.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post) {
        postRepository.save(post); // Save post to the database
    }

    public List<Post> showAllPosts() {
        return postRepository.findAll(); // Get all posts
    }

    public List<Post> getPostByContent(String content) {
        return postRepository.findByContentContaining(content); // Get posts by content
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id); // Delete post by ID
    }
}
