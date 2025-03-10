
package atividade3exer10poo;


public class Temperatura {
       private double celsius; 

    public double getCelsius() {

        return celsius;

    }

    public void setCelsius(double celsius) {

        this.celsius = celsius;

    }

    // Método para converter Celsius para Fahrenheit

    public double converterParaFahrenheit() {

        return (celsius * 9 / 5) + 32;

    }

    // Método para converter Celsius para Kelvin

    public double converterParaKelvin() {

        return celsius + 273.15;

    }

    // Método para exibir todas as temperaturas formatadas

    public void exibirTemperaturas() {

        System.out.println("############# Conversão de Temperatura ############");

        System.out.println("Celsius: " + celsius + " °C");

        System.out.println("Fahrenheit: " + String.format("%.2f", converterParaFahrenheit()) + " °F");

        System.out.println("Kelvin: " + String.format("%.2f", converterParaKelvin()) + " K");      System.out.println("#####################################################");

    }
}
