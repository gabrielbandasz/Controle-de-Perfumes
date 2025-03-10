
package atividade3exer6poo;

import java.util.Scanner;


public class Atividade3Exer6POO {

    
    public static void main(String[] args) {
          Scanner ler = new Scanner (System.in);

       

        Aluno aluno = new Aluno();

       

        System.out.println("Informe a nota 1:");

        aluno.setNota1(ler.nextDouble());

        System.out.println("Informe a nota 2:");

        aluno.setNota2(ler.nextDouble());

       

        aluno.calcular();

    }
    }
    

