package impl.services;

import impl.models.ImoveisAlugados;

public interface ImoveisAlugadosService {
    Iterable<ImoveisAlugados> buscarTodos();

    ImoveisAlugados buscarPorId(Integer id);

    void inserir (ImoveisAlugados alugado);

    void atualizar (ImoveisAlugados alugado, Integer id);

    void deletar (Integer id);
}
