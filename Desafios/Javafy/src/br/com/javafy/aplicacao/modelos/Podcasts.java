package br.com.javafy.aplicacao.modelos;

public class Podcasts extends Audio {
    private String canal;
    private String descricao;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
