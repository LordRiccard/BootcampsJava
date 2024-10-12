package impl.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import impl.models.Imovel;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Integer>{

}
