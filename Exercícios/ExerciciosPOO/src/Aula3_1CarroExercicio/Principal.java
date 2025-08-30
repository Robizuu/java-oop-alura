package Aula3_1CarroExercicio;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro chevrolet = new ModeloCarro();
        chevrolet.definirModelo("Onix");
        chevrolet.definirPrecos(50000,79000,87000);
        chevrolet.setTipoDeCombustivel("Álcool");
        chevrolet.exibirInformacoes();
    }
}
