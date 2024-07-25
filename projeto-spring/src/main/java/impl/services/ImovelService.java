package impl.services;

import impl.models.Imovel;

public interface ImovelService {
    Iterable<Imovel> buscarTodos();

    Imovel buscarPorId(Integer id);

    void inserir (Imovel imovel);

    void atualizar (Imovel imovel, Integer id);

    void deletar (Integer id);
}
