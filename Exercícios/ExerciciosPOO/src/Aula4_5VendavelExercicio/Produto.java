package Aula4_5VendavelExercicio;

public class Produto extends Loja implements Vendavel{
    @Override
    public double calcularPrecoFinal() {
        return preco *= quantidade;
    }
}
