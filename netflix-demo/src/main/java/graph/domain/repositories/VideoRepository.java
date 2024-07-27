package graph.domain.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import graph.domain.models.Video;

@Repository
public interface VideoRepository extends CassandraRepository<Video, Integer>{

}