package Aula3_4ListaProdutoExercicio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produtoNovo = new Produto("Jaca",19.99);
        Produto produtoVelho = new Produto("Banana",9.99);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(produtoNovo);
        listaProdutos.add(produtoVelho);

        double somaPrecos = 0;
        for (Produto item : listaProdutos) {
            somaPrecos += item.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
