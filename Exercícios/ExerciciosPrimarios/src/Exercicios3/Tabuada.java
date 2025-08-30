package Exercicios3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Calculadora de Tabuadas!
                
                Escreva um número de 1 a 10:
                """);
        int escolhaUsuario = leitura.nextInt();
        int numeroDivisao = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(escolhaUsuario + "X" + numeroDivisao + "=" + (escolhaUsuario * numeroDivisao));
            numeroDivisao++;
        }
    }
}
