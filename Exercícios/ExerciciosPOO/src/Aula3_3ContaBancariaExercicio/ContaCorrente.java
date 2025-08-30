package Aula3_3ContaBancariaExercicio;

public class ContaCorrente extends ContaBancaria{
    private double descontoMensal = 20;

    public void cobrarTarifaMensal() {
        carteira -= descontoMensal;
        System.out.println("Novo saldo de: " + carteira);
    }
}
