package atividade8poo;

public class Funcionario {

    private String nome;
    private double salario;
    private double percentual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularPercentual() {
        return (salario * 10.0);
    }

    public double calcularAnual() {
        return ((+salario * 10.0) * 12);
    }

    public void percentual(){
        System.out.println("Salario com reajuste: "+calcularPercentual());
        System.out.println("Salario com reajuste anual: "+calcularAnual());
    
    }
 


}
