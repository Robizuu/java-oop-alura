package Aula3_3ContaBancariaExercicio;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaNova = new ContaCorrente();

        contaNova.consultarSaldo();
        contaNova.depositar(500);
        contaNova.sacar(300);
        contaNova.cobrarTarifaMensal();
        contaNova.consultarSaldo();
    }
}
