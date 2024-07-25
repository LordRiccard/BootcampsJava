package impl.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import impl.models.ImoveisAlugados;
import impl.repositories.ImoveisAlugadosRepository;
import impl.services.ImoveisAlugadosService;

@Service
public class ImoveisAlugadosServiceImp implements ImoveisAlugadosService{

    @Autowired
    private ImoveisAlugadosRepository repo;

    @Override
    public Iterable<ImoveisAlugados> buscarTodos() {
        return repo.findAll();        
    }

    @Override
    public ImoveisAlugados buscarPorId(Integer id) {
        Optional<ImoveisAlugados> alugado = repo.findById(id);
        return alugado.get();
    }

    @Override
    public void inserir(ImoveisAlugados alugado) {
        repo.save(alugado);
    }

    @Override
    public void atualizar(ImoveisAlugados alugado, Integer id) {
        Optional<ImoveisAlugados> busca = repo.findById(id);
        if(busca.isPresent())
            repo.save(busca.get());
    }

    @Override
    public void deletar(Integer id) {
        repo.deleteById(id);
    }

}
