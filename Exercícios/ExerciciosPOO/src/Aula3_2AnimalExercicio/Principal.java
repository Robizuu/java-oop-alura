package Aula3_2AnimalExercicio;

public class Principal {
    public static void main(String[] args) {
        Gato gatao = new Gato();
        Cachorro marlow = new Cachorro();

        marlow.setNome("Marlow");
        marlow.setIdade(16);
        marlow.abanarRabo();
        marlow.emitirSom();

        gatao.setNome("Gatão");
        gatao.setIdade(3);
        gatao.emitirSom();
        gatao.arranharMoveis();
    }
}
