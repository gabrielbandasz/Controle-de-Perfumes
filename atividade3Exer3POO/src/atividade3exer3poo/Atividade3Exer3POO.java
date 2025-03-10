
package atividade3exer3poo;

import java.util.Scanner;


public class Atividade3Exer3POO {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


        // Solicitando dados ao usuário para criar o produto

        System.out.println("Digite o nome do produto: ");

        String nomeProduto = scanner.nextLine();


        System.out.println("Digite a quantidade inicial do produto: ");

        int quantidadeProduto = scanner.nextInt();


        System.out.println("Digite o preço unitário do produto: ");

        double precoProduto = scanner.nextDouble();


        // Criando o produto

        Produto produto = new Produto(nomeProduto, quantidadeProduto, precoProduto);


        // Exibindo as informações iniciais

        produto.exibirInformacoes();

        System.out.println("Valor total do estoque: R$ " + produto.calcularValorTotalEstoque());


        // Interação com o estoque

        System.out.println("\nDeseja adicionar ou remover unidades do estoque? (A para adicionar, R para remover): ");

        scanner.nextLine(); // Consome a quebra de linha após nextDouble()

        String operacao = scanner.nextLine();


        if (operacao.equalsIgnoreCase("A")) {

            System.out.println("Digite a quantidade a ser adicionada: ");

            int quantidadeAdicionar = scanner.nextInt();

            produto.adicionarEstoque(quantidadeAdicionar);

        } else if (operacao.equalsIgnoreCase("R")) {

            System.out.println("Digite a quantidade a ser removida: ");

            int quantidadeRemover = scanner.nextInt();

            produto.removerEstoque(quantidadeRemover);

        } else {

            System.out.println("Operação inválida.");

        }


        // Exibindo as informações após a operação

        produto.exibirInformacoes();

        System.out.println("Valor total do estoque: R$ " + produto.calcularValorTotalEstoque());

    }

    

}


   
