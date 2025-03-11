package javaapplication171;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * Peça ao usuário para inserir os valores de duas resistências em paralelo (R1
 * e R2). Calcule a resistência equivalente usando a fórmula: Req = 1 / ((1/R1)
 * + (1/R2));
 *
 * Imprima o valor de Req.
 *
 * .
 *
 */
public class JavaApplication171 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double z1, y1, x1, x2, y2, z2, cauculo;
        System.out.println("Digite A Cordenada X1!");
        x1 = ler.nextDouble();
        System.out.println("Digite A Cordenada Z1!");
        z1 = ler.nextDouble();
        System.out.println("Digite A Cordenada Y1!");
        y1 = ler.nextDouble();
        System.out.println("Digite A Cordenada X2!");
        x2 = ler.nextDouble();
        System.out.println("Digite A Cordenada Z2!");
        z2 = ler.nextDouble();
        System.out.println("Digite A Cordenada Y2!");
        y2 = ler.nextDouble();
        cauculo = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        System.out.println("A Distância É: "+decimal.format(cauculo));
    }

}
