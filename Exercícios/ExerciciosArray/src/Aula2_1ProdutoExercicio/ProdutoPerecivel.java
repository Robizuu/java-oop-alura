package Aula2_1ProdutoExercicio;

public class ProdutoPerecivel extends Produto{
    String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Produto:" + this.getNome() + " Preço:" + this.getPreco() + " Quantidade:" + this.getQuantidade() + " Data de Validade:" + this.getDataDeValidade();
    }
}
