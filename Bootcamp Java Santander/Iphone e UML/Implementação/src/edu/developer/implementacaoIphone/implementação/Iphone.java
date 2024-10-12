package edu.developer.implementacaoIphone.implementação;

import edu.developer.implementacaoIphone.modelos.AparelhoTelefonico;
import edu.developer.implementacaoIphone.modelos.NavegadorInternet;
import edu.developer.implementacaoIphone.modelos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Aplicativo de aparelho telefonico
    public static String musicaAtual = new String();

    @Override
    public int tocar() {
        System.out.println("Tocando musica");
        return 1;
    }

    @Override
    public int pausar() {
        System.out.println("Musica pausada");
        return 0;
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando: " + musica);
        Iphone.musicaAtual = new String(musica);
    }

    @Override
    public void mostrarMusicaAtual() {
        System.out.println("Tocando agora: " + Iphone.musicaAtual);
    }

    // Aplicativo de Aparelho Telefonico
    @Override
    public String buscarNosContatos(String numero) {
        // String nome = new String();
        // buscando nos contatos pelo numero -> encontra o nome
        // se não estiver presente - retorna o numero
        return numero;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para " + buscarNosContatos(numero));
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Atendendo correio de voz");
    }

    @Override
    public void salvarNosContatos(String numero) {
        // salvando nos contatos
    }

    // Aplicativo de navegador de internet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public String adicionarNovaAba() {
        return "nova aba";
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina atual");
    }

    @Override
    public void salvarNosFavoritos(String url) {
        System.out.println("Salvando nos favoritos");
    }

}
