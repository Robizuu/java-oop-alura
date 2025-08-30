package Aula4_5CalculavelExercicio;

public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
