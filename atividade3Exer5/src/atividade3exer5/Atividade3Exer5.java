
package atividade3exer5;

import java.util.Scanner;

public class Atividade3Exer5 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
           
        ContaBancaria conta = new ContaBancaria();
       
        System.out.println("DEPOSITE O SEU VALOR:");
        conta.setDeposita(ler.nextDouble());
        System.out.println("TIRE O SEU SALDO:");
        conta.setSaldo(ler.nextDouble());
       
        conta.sacar();
       
    
    }
    
}
