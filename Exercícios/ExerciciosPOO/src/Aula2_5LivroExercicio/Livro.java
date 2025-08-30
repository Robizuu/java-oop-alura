package Aula2_5LivroExercicio;

public class Livro {
    private String titulo;
    private String autor;

    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("O título do livro é: " + titulo);
        System.out.println("O autor do livro é: " + autor);
    }
}
