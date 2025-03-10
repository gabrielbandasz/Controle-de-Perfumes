
package atividade3exer2poo;


public class Pessoa {
    private String nome;

    private int idade;

    private double altura;



    // Construtor

    public Pessoa(String nome, int idade, double altura) {

        this.nome = nome;

        this.idade = idade;

        this.altura = altura;

    }



    // Getters

    public String getNome() {

        return nome;

    }



    public int getIdade() {

        return idade;

    }



    public double getAltura() {

        return altura;

    }



    // Setters

    public void setNome(String nome) {

        this.nome = nome;

    }



    public void setIdade(int idade) {

        this.idade = idade;

    }



    public void setAltura(double altura) {

        this.altura = altura;

    }



    // Método para exibir os dados da pessoa

    public void exibirDados() {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Altura: " + altura);

    }



    // Método para verificar se é maior de idade

    public boolean ehMaiorDeIdade() {

        return idade >= 18;

    }



    // Método para calcular quantos anos faltam para atingir 100 anos

    public int anosParaCem() {

        return 100 - idade;

    }  

}


