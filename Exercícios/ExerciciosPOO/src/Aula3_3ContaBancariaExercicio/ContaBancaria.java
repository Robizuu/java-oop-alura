package Aula3_3ContaBancariaExercicio;

public class ContaBancaria {
    protected double carteira;

    public void depositar(double valor) {
        carteira += valor;
        System.out.println("Novo saldo de: " + carteira);
    }

    public void sacar(double valor) {
        carteira -= valor;
        System.out.println("Novo saldo de: " + carteira);
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + carteira);
    }
}

