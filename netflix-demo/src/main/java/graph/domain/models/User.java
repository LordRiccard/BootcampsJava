package graph.domain.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class User {
    @PrimaryKey
    private Integer idUser;
    private String profilePictureURL;
    private String name;
}