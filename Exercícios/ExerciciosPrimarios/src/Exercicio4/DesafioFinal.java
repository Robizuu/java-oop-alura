package Exercicio4;

import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeDeUsuario = "Gabriel Motta Martins";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 2599.99;
        int opcao = 0;
        double receber = 0;
        double transferir = 0;

        System.out.println("*****************");
        System.out.println("\nNome do cliente: " + nomeDeUsuario);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldoDaConta);
        System.out.println("\n*****************");

        String menu = ("""
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Escolha a opção desejada:""");



        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo é de: " + saldoDaConta);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja receber?");
                receber = leitura.nextDouble();
                saldoDaConta += receber;
                System.out.println("Novo valor atualizado: " + saldoDaConta);
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir?");
                transferir = leitura.nextDouble();
                if (saldoDaConta == 0) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldoDaConta -= transferir;
                    System.out.println("Transferência realizada! Novo saldo de: " + saldoDaConta);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
