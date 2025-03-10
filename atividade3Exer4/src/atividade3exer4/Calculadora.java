
package atividade3exer4;


public class Calculadora {
      private double numero;


    // Getter e Setter para o número

    public double getNumero() {

        return numero;

    }


    public void setNumero(double numero) {

        this.numero = numero;

    }


    // Método que retorna a soma, subtração, multiplicação ou divisão

    public double calcular(String operacao, double outroNumero) {

        switch (operacao) {

            case "soma":

                return numero + outroNumero;

            case "subtracao":

                return numero - outroNumero;

            case "multiplicacao":

                return numero * outroNumero;

            case "divisao":

                if (outroNumero != 0) {

                    return numero / outroNumero;

                } else {

                    System.out.println("Erro: divisão por zero não permitida.");

                    return Double.NaN; // Retorna "Not a Number" em caso de erro

                }

            default:

                System.out.println("Operação inválida.");

                return Double.NaN;

        }

    }


    // Método para calcular a raiz quadrada do número

    public double calcularRaizQuadrada() {

        if (numero >= 0) {

            return Math.sqrt(numero);

        } else {

            System.out.println("Erro: não é possível calcular a raiz quadrada de um número negativo.");

            return Double.NaN;

        }

    }


    // Método para calcular a potência (recebe um expoente)

    public double calcularPotencia(int expoente) {

        return Math.pow(numero, expoente);

    }


    // Desafio extra: Método para calcular o fatorial do número

    public long calcularFatorial() {

        if (numero < 0 || numero != (int) numero) { // Verifica se o número é negativo ou não inteiro

            System.out.println("Erro: o número precisa ser um inteiro não negativo.");

            return -1;

        }

        long fatorial = 1;

        for (int i = 1; i <= (int) numero; i++) {

            fatorial *= i;

        }

        return fatorial;

    }
}
