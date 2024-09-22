package bg.tuvarna.sit.blogmanagement.controller;

import bg.tuvarna.sit.blogmanagement.model.Post;
import bg.tuvarna.sit.blogmanagement.service.PostService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/posts")
@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public void addPost(@Valid @NotNull @RequestBody Post post){
        postService.addPost(post);
    }

    @GetMapping
    public List<Post> showAllPosts(){
        return postService.showAllPosts();
    }

    @GetMapping(path = "content/{content}")
    public List<Post> getPostByContent(@PathVariable("content") String content){
        return postService.getPostByContent(content);
    }

    @DeleteMapping(path = "{id}")
    public void deletePost(@PathVariable("id") Long id){
        postService.deletePostById(id);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Post> updatePostById(@PathVariable("id") Long id, @Valid @RequestBody Post post){
        try {
            Post updatedPost = postService.updatePostById(id, post);
            return new ResponseEntity<>(updatedPost, HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
