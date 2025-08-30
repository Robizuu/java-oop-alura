package Aula2_3ProdutoExercicio2;

public class Principal {
    public static void main(String[] args) {
        Produto shampoo = new Produto("Dove", 19.99);

        System.out.println("Nome do produto: " + shampoo.getNomeProduto());
        System.out.println("Preço: " + shampoo.getPreco());

        shampoo.aplicarDesconto(10);
        System.out.println("Novo preço após Desconto: " + shampoo.getPreco());
    }
}
