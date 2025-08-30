package Aula3_6ContaBancariaExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaGuga = new ContaBancaria(369,99666.33);
        ContaBancaria contaGabriel = new ContaBancaria(2469,12000);

        ArrayList<ContaBancaria> listaSaldo = new ArrayList<>();

        listaSaldo.add(contaGuga);
        listaSaldo.add(contaGabriel);

        ContaBancaria contaMaiorSaldo = listaSaldo.get(0);
        for (ContaBancaria contas : listaSaldo) {
            if (contas.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = contas;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() + ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
