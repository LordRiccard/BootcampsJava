package graph.domain.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import graph.domain.models.Account;

@Repository
public interface AccountRepository extends CassandraRepository<Account, Integer>{

}