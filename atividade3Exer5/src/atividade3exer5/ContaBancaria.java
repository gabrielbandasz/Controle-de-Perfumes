
package atividade3exer5;


public class ContaBancaria {
     private String titular;
    private double saldo;
    private double deposita;
   
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
   
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
   
    public double getDeposita(){
        return deposita;
    }
    public void setDeposita(double deposita){
        this.deposita = deposita;
    }
   
   
   public void sacar(){
       deposita=deposita-saldo;
       System.out.println("O SALDO ATUAL É"+deposita);
       deposita= deposita*0.5;
       System.out.println("O SEU RENDIMENTO COM BASE NA TAXA DE JUROS FICOU: "+deposita);
       
   } 
}
