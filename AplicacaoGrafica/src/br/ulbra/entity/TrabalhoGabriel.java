package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrabalhoGabriel {

    public ArrayList lista;

    public TrabalhoGabriel() {
        lista = new ArrayList();

    }

    public void salvar(String produto) {
        lista.add(produto);
        JOptionPane.showMessageDialog(null, produto + " Salvo com sucesso");
    }

    public String listar() {
        String resultado = "Lista de produtos\n";
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                resultado += lista.get(i) + "\n";
            }
        } else {
            resultado = "lista vazia!!";
        }
        return resultado;

    }

    public void excluir(int cod) {
        if (!lista.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < lista.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o "
                        + lista.get(cod), "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    lista.remove(cod);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Arregou xiru");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir uma lista vazia");
        }

    }

    public void alterar(int cod, String novoNome) {
        if (!lista.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < lista.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o "
                        + lista.get(cod), "Alteração", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    lista.set(cod, novoNome);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Arregou xiru");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar uma lista vazia");
        }

    }

}
