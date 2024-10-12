package impl.services.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import impl.models.Cliente;
import impl.repositories.ClienteRepository;
import impl.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        Optional<Cliente> cliente = repo.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        repo.save(cliente);
    }

    @Override
    public void atualizar(Cliente cliente, Integer id) {
        Optional<Cliente> busca = repo.findById(id);
        if(busca.isPresent())
            repo.save(busca.get());
    }

    @Override
    public void deletar(Integer id) {
        repo.deleteById(id);
    }

}
