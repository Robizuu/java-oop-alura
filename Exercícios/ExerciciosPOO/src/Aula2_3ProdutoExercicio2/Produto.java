package Aula2_3ProdutoExercicio2;

public class Produto {
    private String nomeProduto;
    private double preco;

    public Produto(String nome, double preco) {
        this.nomeProduto = nome;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }

    //    public double getPreco() {
//        return preco;
//    }
//
//    public String getNomeProduto() {
//        return nomeProduto;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public void setNomeProduto(String nomeProduto) {
//        this.nomeProduto = nomeProduto;
//    }
//
//    public void aplicarDesconto() {
//        double desconto = 10.0;
//        preco = preco * (1 - desconto / 100);
//    }
}
