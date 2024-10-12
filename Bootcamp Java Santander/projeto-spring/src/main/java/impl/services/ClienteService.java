package impl.services;

import impl.models.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Integer id);

    void inserir (Cliente cliente);

    void atualizar (Cliente cliente, Integer id);

    void deletar (Integer id);
}
