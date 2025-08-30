package Exercicios2;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 1250.00;
        double percentualDesconto = 10;

        double divisaoDesconto = precoOriginal / percentualDesconto;

        double precoComDesconto = precoOriginal - divisaoDesconto;
        System.out.println(precoComDesconto);

    }
}
