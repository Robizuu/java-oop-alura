package Aula4_5CalculavelExercicio;

public class Livro extends Produto implements Calculavel{
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
