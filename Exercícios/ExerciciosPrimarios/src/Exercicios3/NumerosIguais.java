package Exercicios3;

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Insira o segundo número:");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Os números são diferentes e o primeiro é maior que o segundo!");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("Os números são diferentes e o segundo é maior que o primeiro!");
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
