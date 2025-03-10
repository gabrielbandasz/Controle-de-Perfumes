
package atividade3exer1;

import java.util.Scanner;


public class Atividade3Exer1 {

   
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         Manipulacao mani = new Manipulacao();
         
       System.out.println("digite sua palavra");
       mani.setPalavra(ler.nextLine());
       mani.contador();
        System.out.println("Informe uma palavra");
       mani.verificarCarateres(ler.nextLine());
       
 
    
    }
    
}
