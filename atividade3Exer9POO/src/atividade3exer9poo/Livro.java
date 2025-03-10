
package atividade3exer9poo;


public class Livro {
     private String titulo;

    private String autor;

    private int totalPaginas;

    private int paginasLidas;


    // Construtor

    public Livro(String titulo, String autor, int totalPaginas) {

        this.titulo = titulo;

        this.autor = autor;

        this.totalPaginas = totalPaginas;

        this.paginasLidas = 0; // Inicia com 0 páginas lidas

    }


    // Getters e Setters

    public String getTitulo() {

        return titulo;

    }


    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }


    public String getAutor() {

        return autor;

    }


    public void setAutor(String autor) {

        this.autor = autor;

    }


    public int getTotalPaginas() {

        return totalPaginas;

    }


    public void setTotalPaginas(int totalPaginas) {

        this.totalPaginas = totalPaginas;

    }


    public int getPaginasLidas() {

        return paginasLidas;

    }


    public void setPaginasLidas(int paginasLidas) {

        if (paginasLidas <= totalPaginas) {

            this.paginasLidas = paginasLidas;

        } else {

            System.out.println("Erro: Você não pode ler mais páginas do que o total do livro.");

        }

    }


    // Método para atualizar o número de páginas lidas

    public void atualizarProgresso(int paginas) {

        if (paginasLidas + paginas <= totalPaginas) {

            paginasLidas += paginas;

            System.out.println("Progresso atualizado! Você já leu " + paginasLidas + " páginas.");

        } else {

            System.out.println("Erro: Você está tentando ler mais páginas do que o livro possui.");

        }

    }


    // Método para exibir o progresso da leitura em porcentagem

    public void exibirProgresso() {

        double progresso = ((double) paginasLidas / totalPaginas) * 100;

        System.out.println("Progresso de leitura: " + String.format("%.2f", progresso) + "%");

    }


    // Método para verificar se a leitura foi concluída

    public boolean leituraCompleta() {

        return paginasLidas == totalPaginas;

    }   
}
