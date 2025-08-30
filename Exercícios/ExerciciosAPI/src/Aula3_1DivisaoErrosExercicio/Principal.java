package Aula3_1DivisaoErrosExercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Escolha o primeiro número: ");
            int numeroUm = entrada.nextInt();
            System.out.println("Escolha o segundo número: ");
            int numeroDois = entrada.nextInt();
            int numeroTres = numeroUm / numeroDois;
            System.out.println(numeroTres);
        } catch (ArithmeticException e) {
            System.out.println("Escolha um número que não seja 0!");
        } finally {
            System.out.println("Finalizando o programa...");
        }
    }
}
