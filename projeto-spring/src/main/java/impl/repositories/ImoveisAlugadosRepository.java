package impl.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import impl.models.ImoveisAlugados;

@Repository
public interface ImoveisAlugadosRepository extends CrudRepository<ImoveisAlugados, Integer>{

}
