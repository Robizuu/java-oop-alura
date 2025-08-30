package Aula3_2CastingExercicio;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
    }
}
