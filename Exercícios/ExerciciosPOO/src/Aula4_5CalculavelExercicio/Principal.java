package Aula4_5CalculavelExercicio;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        livro.setPreco(100);
        double precoFinalLivro = livro.calcularPrecoFinal();
        System.out.println(precoFinalLivro);

        produto.setPreco(200);
        double precoFinalProduto = produto.calcularPrecoFinal();
        System.out.println(precoFinalProduto);


    }
}
