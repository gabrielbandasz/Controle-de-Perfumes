
package atividade3exer10poo;

import java.util.Scanner;


public class Atividade3Exer10POO {

   
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

        // Entrada de temperatura

        System.out.print("Digite a temperatura em Celsius: ");

        double tempCelsius = ler.nextDouble();

        // Criando o objeto

        Temperatura temp = new Temperatura();

        // Exibir conversões

        temp.exibirTemperaturas();

    
    }
    
}
