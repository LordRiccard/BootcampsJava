package edu.developer.implementacaoIphone.modelos;

public interface NavegadorInternet {
    public abstract void exibirPagina(String url);
    public abstract String adicionarNovaAba();
    public abstract void atualizarPagina();
    public abstract void salvarNosFavoritos(String url);
}
