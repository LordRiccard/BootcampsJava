package graph.domain.repositories;

import graph.domain.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.cassandra.repository.CassandraRepository;

@Repository
public interface UserRepository extends CassandraRepository<User, Integer> {

}
