package Exercicios3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para fatorar: ");
        int escolhaUsuario = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= escolhaUsuario; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
        System.out.println("O fatorial de " + escolhaUsuario + " é: " + fatorial);
    }
}
