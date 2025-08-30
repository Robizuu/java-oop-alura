package br.com.javafy.aplicacao.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;



    public void curtir() {
        this.totalDeCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
