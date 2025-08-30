package Exercicios3;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Calculadora de Áreas!
                
                Escolha uma das opções:
                1. Calcular área do quadrado.
                2. Calcular área do circulo.
                3. Sair.
                """);
        int opcoesUsuario = leitura.nextInt();

        if (opcoesUsuario == 1) {
            System.out.println("Digite o lado de um quadrado: ");
            double quadradoInput = leitura.nextDouble();
            double respostaQuadrado = quadradoInput * quadradoInput;
            System.out.println("A área do quadrado é: " + respostaQuadrado + "!");
        } else if (opcoesUsuario == 2) {
            System.out.println("Digite o raio do circulo: ");
            double circuloInput = leitura.nextDouble();
            double respostaCirculo = (circuloInput * circuloInput) * 3.14;
            System.out.println("A área do circulo é: " + respostaCirculo + "!");
        } else {
            System.out.println("Desligando programa...");
        }
    }
}
