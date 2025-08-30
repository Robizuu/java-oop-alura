package Aula1_4CarroExercicio;

public class Carro {
    String modelo;
    String marca;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A marca do carro é: " + marca);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
    }

    void calcularIdadeCarro(int anoAtual) {
        ano = ano - anoAtual;
        System.out.println(ano);
    }

    int calculaIdade() {
        return 2025 - ano;
    }
}
