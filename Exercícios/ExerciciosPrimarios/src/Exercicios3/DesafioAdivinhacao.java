package Exercicios3;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int numeroEscolhido = 0;
        int tentativas = 1;
        Scanner leitura = new Scanner(System.in);
        System.out.println(numeroAleatorio);

        System.out.println("Jogo do número secreto!");

        System.out.println("Digite o número secreto:");
        numeroEscolhido = leitura.nextInt();

        for (int i = 0; i < 5; i++) {

            if (numeroEscolhido > numeroAleatorio) {
                System.out.println("O numero escolhido é menor, tente novamente:");
                numeroEscolhido = leitura.nextInt();
                tentativas++;
            } else if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O numero escolhido é maior, tente novamente:");
                numeroEscolhido = leitura.nextInt();
                tentativas++;
            } else {
                System.out.println("Parabéns, você acertou com " + tentativas + " tentativas!");
                break;
            }

        }


    }
}
