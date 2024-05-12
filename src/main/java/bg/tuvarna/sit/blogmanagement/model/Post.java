package bg.tuvarna.sit.blogmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Post {
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String content;

    public Post(@JsonProperty("id") UUID id,
                @JsonProperty("title") String title,
                @JsonProperty("content") String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
