package impl.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import impl.models.Imovel;
import impl.repositories.ImovelRepository;
import impl.services.ImovelService;

@Service
public class ImovelServiceImpl implements ImovelService {

    @Autowired
    private ImovelRepository repo;

    @Override
    public Iterable<Imovel> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public Imovel buscarPorId(Integer id) {
        Optional<Imovel> imovel = repo.findById(id);
        return imovel.get();
    }

    @Override
    public void inserir(Imovel imovel) {
        repo.save(imovel);
    }

    @Override
    public void atualizar(Imovel imovel, Integer id) {
        Optional<Imovel> busca = repo.findById(id);
        if(busca.isPresent())
            repo.save(busca.get());
    }

    @Override
    public void deletar(Integer id) {
        repo.deleteById(id);
    }

}
