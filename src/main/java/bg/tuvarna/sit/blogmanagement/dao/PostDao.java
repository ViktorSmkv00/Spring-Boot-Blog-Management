package bg.tuvarna.sit.blogmanagement.dao;

import bg.tuvarna.sit.blogmanagement.model.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostDao {
    int insertPost(UUID id, Post post);

    default int insertPost(Post post){
        UUID id = UUID.randomUUID();
        return insertPost(id, post);
    }


    List<Post> showAllPosts();



    List<Post> getPostByContent(String content);

    Optional<Post> getPostById(UUID id);

    int deletePostById(UUID id);
}
