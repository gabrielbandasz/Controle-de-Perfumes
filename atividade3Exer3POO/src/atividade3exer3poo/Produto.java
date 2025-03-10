
package atividade3exer3poo;


public class Produto {
      private String nome;

    private int quantidade;

    private double preco;


    // Construtor

    public Produto(String nome, int quantidade, double preco) {

        this.nome = nome;

        this.quantidade = quantidade;

        this.preco = preco;

    }


    // Getters e Setters

    public String getNome() {

        return nome;

    }


    public void setNome(String nome) {

        this.nome = nome;

    }


    public int getQuantidade() {

        return quantidade;

    }


    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;

    }


    public double getPreco() {

        return preco;

    }


    public void setPreco(double preco) {

        this.preco = preco;

    }


    // Método para adicionar uma quantidade ao estoque

    public void adicionarEstoque(int quantidade) {

        if (quantidade > 0) {

            this.quantidade += quantidade;

            System.out.println(quantidade + " unidades adicionadas ao estoque.");

        } else {

            System.out.println("Quantidade inválida para adicionar.");

        }

    }


    // Método para remover uma quantidade do estoque (com verificação)

    public void removerEstoque(int quantidade) {

        if (quantidade > 0 && this.quantidade >= quantidade) {

            this.quantidade -= quantidade;

            System.out.println(quantidade + " unidades removidas do estoque.");

        } else {

            System.out.println("Estoque insuficiente ou quantidade inválida.");

        }

    }


    // Método para exibir as informações do produto

    public void exibirInformacoes() {

        System.out.println("Produto: " + nome);

        System.out.println("Quantidade em estoque: " + quantidade);

        System.out.println("Preço unitário: R$ " + preco);

    }


    // Desafio extra: Método para calcular o valor total do estoque

    public double calcularValorTotalEstoque() {

        return quantidade * preco;

    }
    
    
}
