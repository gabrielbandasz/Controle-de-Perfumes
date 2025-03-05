
package atividade8poo;

import java.util.Scanner;


public class Atividade8POO {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Informe o seu nome:");
        funcionario.setNome(ler.nextLine());
        System.out.println("Informe o seu salario:");
        funcionario.setSalario(ler.nextDouble());
        
        funcionario.percentual();
        
    }
    
}
