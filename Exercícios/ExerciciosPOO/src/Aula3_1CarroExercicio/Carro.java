package Aula3_1CarroExercicio;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInformacoes() {
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O preço do primeiro ano: " + precoAno1);
        System.out.println("O preço do segundo ano: " + precoAno2);
        System.out.println("O preço do terceiro ano: " + precoAno3);
        System.out.println("Calculo ano mais barato: " + calculoAnoBarato());
        System.out.println("Calculo ano mais caro: " + calculoAnoCaro());
    }

    private double calculoAnoBarato() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double calculoAnoCaro() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

}
