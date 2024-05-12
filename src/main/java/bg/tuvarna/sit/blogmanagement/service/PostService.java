package bg.tuvarna.sit.blogmanagement.service;

import bg.tuvarna.sit.blogmanagement.dao.PostDao;
import bg.tuvarna.sit.blogmanagement.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostService {
    private final PostDao postDao;

    @Autowired
    public PostService(@Qualifier("postRepository") PostDao postDao) {
        this.postDao = postDao;
    }

    public int addPost(Post post){
        return postDao.insertPost(post);
    }

    public List<Post> showAllPosts(){
        return postDao.showAllPosts();
    }

    public List<Post> getPostByContent(String content){
        return postDao.getPostByContent(content);
    }


    public int deletePostById(UUID id){
        return postDao.deletePostById(id);
    }
}
