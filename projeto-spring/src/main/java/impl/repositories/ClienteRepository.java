package impl.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import impl.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
