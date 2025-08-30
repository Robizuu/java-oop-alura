package Aula2_1ProdutoExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto gugaProduto = new Produto("Jaca",9.99,5);
        Produto miguelProduto = new Produto("Banana",2.99,24);
        ProdutoPerecivel natanProduto = new ProdutoPerecivel("Melancia",49.99,2,"23/08/2025");

        //gugaProduto.setNome("Jaca");
        //gugaProduto.setPreco(9.99);
        //gugaProduto.setQuantidade(5);

        //miguelProduto.setNome("Banana");
        //miguelProduto.setPreco(2.99);
        //miguelProduto.setQuantidade(24);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(gugaProduto);
        listaDeProdutos.add(miguelProduto);

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos);
        System.out.println(natanProduto);
    }
}
