package edu.developer.implementacaoIphone.modelos;

public interface AparelhoTelefonico {
    public abstract void ligar(String numero);
    public abstract void atender();
    public abstract void iniciarCorreioVoz();
    public abstract String buscarNosContatos(String numero);
    public abstract void salvarNosContatos(String numero);
}
