package Exercicios3;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroUsuario = leitura.nextInt();

        if (numeroUsuario > 0) {
            System.out.println("Número positivo!");
        } else if (numeroUsuario < 0) {
            System.out.println("Numero negativo!");
        } else {
            System.out.println("Numero é zero!");
        }
    }
}
