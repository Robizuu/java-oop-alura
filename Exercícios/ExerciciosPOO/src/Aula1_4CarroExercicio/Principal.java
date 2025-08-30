package Aula1_4CarroExercicio;

public class Principal {
    public static void main(String[] args) {
        Carro carroNovo = new Carro();
        carroNovo.modelo = "Kwid";
        carroNovo.marca = "Renault";
        carroNovo.ano = 2020;
        carroNovo.cor = "Prata";

        carroNovo.exibirFichaTecnica();
        System.out.println(carroNovo.calculaIdade());
    }
}
