
package atividade3exer9poo;

import java.util.Scanner;


public class Atividade3Exer9POO {

    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);


        // Criando um livro

        System.out.print("Digite o título do livro: ");

        String titulo = ler.nextLine();


        System.out.print("Digite o autor do livro: ");

        String autor = ler.nextLine();


        System.out.print("Digite o número total de páginas do livro: ");

        int totalPaginas = ler.nextInt();


        Livro livro = new Livro(titulo, autor, totalPaginas);


        // Atualizar progresso de leitura

        System.out.print("Quantas páginas você leu? ");

        int paginasLidas = ler.nextInt();

        livro.atualizarProgresso(paginasLidas);


        // Exibir progresso da leitura

        livro.exibirProgresso();


        // Verificar se a leitura foi concluída

        if (livro.leituraCompleta()) {

            System.out.println("Parabéns! Você concluiu a leitura do livro.");

        } else {

            System.out.println("Continue lendo para completar o livro.");

        }



       
    }
    
}
