package bg.tuvarna.sit.blogmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(name = "title")
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


    public Post() {
    }
}
