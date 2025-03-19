
package vetoresdinamicos0;

import java.util.ArrayList;
import java.util.Scanner;


public class VetoresDinamicos0 {

 
    public static void main(String[] args) {
       ArrayList listaCompras = new ArrayList();
        Scanner ler = new Scanner(System.in);

        int op = 9;
        while (op != 0) {
            System.out.println("menu\n"
                    + "1 - adicionar Produtos\n"
                    + "2 - Listar Produtos\n"
                    + "3 - Excluir Produto\n"
                    + "4 - Alterar Produto\n"
                    + "5 - limpar a lista de produtos\n"
                    + "0 - sair");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println("informe o nome do produto");
                    listaCompras.add(ler.next());
                    System.out.println("produto salvo com sucesso!!");
                    break;
                case 2:
                    if (!listaCompras.isEmpty()) {
                        System.out.println("Lista de compraas.\n");
                        for (int i = 0; i < listaCompras.size(); i++) {
                            System.out.println((i + 1) + " - " + listaCompras.get(i) + "\n");
                        }
                    } else {
                        System.out.println("A lista de compras esta vazia!!");
                    }
                    break;
                case 3:
                    if (!listaCompras.isEmpty()) {
                        int indice;
                        System.out.println("qual o numero do item que deseja apagar");
                        indice = ler.nextInt();
                        if ((indice - 1) >= 0 && (indice - 1) < listaCompras.size()) {
                            listaCompras.remove(indice - 1);
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Este produto não existe!");
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    break;
                case 4:
                    if (!listaCompras.isEmpty()) {
                        int indice;
                        System.out.println("qual o numero do item que deseja apagar");
                        indice = ler.nextInt();

                        if ((indice - 1) >= 0 && (indice - 1) < listaCompras.size()) {
                            System.out.println("qual o novo nome do produto");
                            String nomenovo = ler.next();
                            listaCompras.set((indice - 1), nomenovo);
                            System.out.println("produto atualizado com sucesso");
                        } else {
                            System.out.println("produto inexistente");

                        }
                    } else {
                        System.out.println("lista vazia");
                    }
                    break;
                case 5:
                    if (!listaCompras.isEmpty()) {

                        int sn;
                        System.out.println("tem certeza? 1 - s OU 2 - não");
                        sn = ler.nextInt();
                        if (sn == 1) {
                            listaCompras.clear();

                        } else {
                            System.out.println("Limpeza Cancelada!!");

                        }

                    } else {
                        System.out.println("lista ja se encontra vazia");
                    }
                    break;
                default:
                    if (op == 0) {
                        System.out.println("bye bye");

                    } else {
                        System.out.println("opção invalida");
                    }
            }
        }
    }
}
    
    

