package Aula4_5VendavelExercicio;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();

        produto.setPreco(24.99);
        produto.setQuantidade(5);

        servico.setPreco(5);
        servico.setMinutosUso(60);

        double precoFinal = produto.calcularPrecoFinal();
        double servicoFinal = servico.calcularPrecoFinal();

        System.out.println(precoFinal);
        System.out.println(servicoFinal);
    }
}
