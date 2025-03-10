
package atividade3exer1;


public class Manipulacao {
      private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void contador() {
        System.out.println("" + palavra.length());
     
   }

    public void verificarCarateres(String palavra) {
        if (palavra.length() % 2 == 0){
            System.out.println("Palavra informada tem o numero par de caracteres");
        }else {
            System.out.println("Palavra informada tem o numero impar de caracteres");
           
        }
    }

}
