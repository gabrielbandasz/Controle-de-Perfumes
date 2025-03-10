
package atividade3exer4;

import java.util.Scanner;


public class Atividade3Exer4 {

    
    public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);


        // Instanciando o objeto Calculadora

        Calculadora calculadora = new Calculadora();


        // Solicitando ao usuário um número

        System.out.println("Digite um número: ");

        double numero = scanner.nextDouble();

        calculadora.setNumero(numero);


        // Exibindo os resultados das operações

        System.out.println("\nEscolha uma operação: soma, subtracao, multiplicacao, divisao");

        scanner.nextLine(); // Consumir a linha em branco deixada pelo nextDouble()

        String operacao = scanner.nextLine();


        System.out.println("Digite outro número para a operação: ");

        double outroNumero = scanner.nextDouble();


        double resultado = calculadora.calcular(operacao, outroNumero);

        if (!Double.isNaN(resultado)) {

            System.out.println("Resultado da " + operacao + ": " + resultado);

        }


        // Calculando a raiz quadrada

        double raizQuadrada = calculadora.calcularRaizQuadrada();

        if (!Double.isNaN(raizQuadrada)) {

            System.out.println("Raiz quadrada de " + numero + ": " + raizQuadrada);

        }


        // Calculando a potência

        System.out.println("Digite o expoente para calcular a potência: ");

        int expoente = scanner.nextInt();

        double potencia = calculadora.calcularPotencia(expoente);

        System.out.println("Resultado de " + numero + " elevado à " + expoente + ": " + potencia);


        // Calculando o fatorial

        long fatorial = calculadora.calcularFatorial();

        if (fatorial != -1) {

            System.out.println("Fatorial de " + (int) numero + ": " + fatorial);

        }

    }
        
        
    }
    

