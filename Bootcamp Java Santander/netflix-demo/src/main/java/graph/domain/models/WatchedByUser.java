package graph.domain.models;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class WatchedByUser {
    @PrimaryKey
    private Integer idWatched;
    private Integer idUser;
    private Integer idVideo;
    private Date whenWatched;
    private Integer rating;
}
