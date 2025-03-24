package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrabalhoGabriel {

    public ArrayList<String> listaOriginal;
    public ArrayList<String> listaOrdenada;

    public TrabalhoGabriel() {
        listaOriginal = new ArrayList<>();
        listaOrdenada = new ArrayList<>();
    }

    // Método para salvar um produto
    public void salvar(String produto) {
        listaOriginal.add(produto);  // Adiciona à lista original
        listaOrdenada.add(produto);   // Também adiciona à lista ordenada
        JOptionPane.showMessageDialog(null, produto + " Salvo com sucesso");
    }

    // Método para listar os produtos
    public String listar() {
        String resultado = "Lista de produtos\n";
        
        if (!listaOrdenada.isEmpty()) {
            for (int i = 0; i < listaOrdenada.size(); i++) {
                resultado += listaOrdenada.get(i) + "\n";
            }
        } else {
            resultado = "Lista vazia!!";
        }

        return resultado;
    }

    // Método para excluir um produto
    public void excluir(int cod) {
        if (!listaOrdenada.isEmpty()) {
            cod = cod - 1;  // Ajusta o código para o índice da lista
            if (cod >= 0 && cod < listaOrdenada.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o "
                        + listaOrdenada.get(cod), "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaOriginal.remove(cod);
                    listaOrdenada.remove(cod); // Remove da lista ordenada também
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir da lista vazia");
        }
    }

    // Método para obter a quantidade de produtos na lista
    public int quantidade() {
        return listaOriginal.size();
    }

    // Método para limpar as listas
    public void limparLista() {
        listaOriginal.clear();
        listaOrdenada.clear();
    }

    // Método para alterar o nome de um produto
    public void alterar(int cod, String novoNome) {
        if (!listaOrdenada.isEmpty()) {
            cod = cod - 1;  // Ajusta o código para o índice da lista
            if (cod >= 0 && cod < listaOrdenada.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o "
                        + listaOrdenada.get(cod), "Alteração", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaOriginal.set(cod, novoNome);  // Altera na lista original
                    listaOrdenada.set(cod, novoNome);  // Altera também na lista ordenada
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar uma lista vazia");
        }
    }

    // Método para ordenar a lista em ordem alfabética
    public void ordenarAlfabeticamente() {
        listaOrdenada.sort(String::compareTo); // Ordena a lista de forma alfabética
    }

    // Método para restaurar a lista à ordem original
    public void resetarLista() {
        listaOrdenada.clear(); // Limpa a lista ordenada
        listaOrdenada.addAll(listaOriginal); // Restaura a lista ordenada para o estado original
    }

    // Método para limpar a lista
    public void limpar() {
        listaOriginal.clear();
        listaOrdenada.clear();
    }
}
