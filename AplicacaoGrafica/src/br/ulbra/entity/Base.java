
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Base {

  public ArrayList lista;
    public Base(){
        lista = new ArrayList();
       
    }
    public void salvar(String produto){
        lista.add(produto);
        JOptionPane.showMessageDialog(null,produto+" Salvo com sucesso");
    }
    public String listar(){
        String resultado = "Lista de produtos\n";
        if(!lista.isEmpty()){
            for(int i=0; i<lista.size();i++){
                resultado += lista.get(i)+"\n";
            }
            resultado = "lista vazia!!";
           
        }
        return resultado;
       
   
}
}
 

