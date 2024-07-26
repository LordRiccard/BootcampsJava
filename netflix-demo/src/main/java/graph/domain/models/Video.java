package graph.domain.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class Video {
    @PrimaryKey
    private Integer idVideo;
    private String title;
    private String description;
    private String boxArtURL;
    private Integer globalRating;
    private Video trailer;
}
