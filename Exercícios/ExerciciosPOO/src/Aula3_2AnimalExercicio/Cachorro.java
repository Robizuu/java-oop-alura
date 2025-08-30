package Aula3_2AnimalExercicio;

public class Cachorro extends Animal {
    public void abanarRabo() {
        System.out.println(nome + " abanava o rabo...");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emitia o som como: AU AU AU");
    }
}
