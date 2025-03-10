
package atividade3exer2poo;

import java.util.Scanner;


public class Atividade3Exer2POO {

   
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);


        // Solicitando ao usuário os dados

        System.out.print("Digite o nome: ");

        String nome = scanner.nextLine();

        

        System.out.print("Digite a idade: ");

        int idade = scanner.nextInt();

        

        System.out.print("Digite a altura (em metros): ");

        double altura = scanner.nextDouble();


        // Criando um objeto Pessoa

        Pessoa pessoa = new Pessoa(nome, idade, altura);


        // Exibindo os dados

        pessoa.exibirDados();


        // Verificando maioridade

        if (pessoa.ehMaiorDeIdade()) {

            System.out.println("A pessoa é maior de idade.");

        } else {

            System.out.println("A pessoa é menor de idade.");

        }


        // Calculando anos para 100

        System.out.println("Faltam " + pessoa.anosParaCem() + " anos para atingir 100 anos.");

          }
        
        
        
    }
    

