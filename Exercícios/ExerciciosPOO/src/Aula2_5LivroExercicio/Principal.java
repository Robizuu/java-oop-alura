package Aula2_5LivroExercicio;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Junji Ito Collection","Junji Ito");
        Livro livro2 = new Livro("One Piece","Oda");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
