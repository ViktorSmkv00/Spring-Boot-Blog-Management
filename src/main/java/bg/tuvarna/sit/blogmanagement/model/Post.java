package bg.tuvarna.sit.blogmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;



@Entity // Add this annotation to mark this class as a JPA entity
@Table(name = "posts") // Optional: Specify the table name
public class Post {

    @Id // Mark the id field as the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // Let JPA generate the ID automatically
    private Long id;

    @NotBlank
    @Column(name = "title") // Specify the column in the database (optional)
    private String title;

    @NotBlank
    @Column(name = "content")
    private String content;

    public Post(@JsonProperty("id") Long id,
                @JsonProperty("title") String title,
                @JsonProperty("content") String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Default constructor for JPA
    public Post() {
    }
}
