package bg.tuvarna.sit.blogmanagement.dao;

import bg.tuvarna.sit.blogmanagement.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Custom method to find posts by content
    List<Post> findByContentContaining(String content);
}

