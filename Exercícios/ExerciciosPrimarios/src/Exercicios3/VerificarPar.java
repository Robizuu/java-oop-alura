package Exercicios3;

import java.util.Scanner;

public class VerificarPar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroUsuario = leitura.nextInt();

        if (numeroUsuario % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
    }
}
