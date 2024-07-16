package edu.developer.implementacaoIphone.modelos;

public interface ReprodutorMusical {
    public abstract int tocar();
    public abstract int pausar();
    public abstract void selecionarMusica(String musica);
    public abstract void mostrarMusicaAtual();
}
