import java.util.Scanner;

// Classe Produto
class Produto {
    private String nome;
    private int quantidadeEstoque;

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}

// Interface EstoqueStrategy:
interface EstoqueStrategy {
    String verificar(Produto produto);
}

// TODO: Crie a classe VerificarEstoqueStrategy que implementa a interface EstoqueStrategy e aplique a lógica de verificação de estoque:
// TODO: Defina o limite mínimo de estoque:
class VerificarEstoqueStrategy implements EstoqueStrategy {
    final int limite = 10;

    @Override
    public String verificar(Produto produto) {
        // TODO: Implemente a lógica para verificar o estoque do produto:
        if (produto.getQuantidadeEstoque() < 10)
            return "Alerta: Estoque baixo de " + produto.getNome();
        return "Estoque de " + produto.getNome() + " esta em nivel adequado"
    }
}



// Classe principal
public class VerificacaoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto = scanner.nextLine();
        int quantidadeEstoque = scanner.nextInt();

        // Criação da entidade Produto
        Produto produto = new Produto(nomeProduto, quantidadeEstoque);

        // Criação e execução da estratégia de verificação de estoque
        EstoqueStrategy estoqueStrategy = new VerificarEstoqueStrategy();
        String resultado = estoqueStrategy.verificar(produto);

        System.out.println(resultado);

        scanner.close();
    }
}