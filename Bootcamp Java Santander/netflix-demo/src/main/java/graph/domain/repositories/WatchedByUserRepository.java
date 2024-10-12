package graph.domain.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import graph.domain.models.WatchedByUser;

@Repository
public interface WatchedByUserRepository extends CassandraRepository<WatchedByUser, Integer>{

}