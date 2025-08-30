package Aula4_5VendavelExercicio;

public class Servico extends Loja implements Vendavel{
    @Override
    public double calcularPrecoFinal() {
        return preco *= minutosUso;
    }
}
