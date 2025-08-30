package Aula4_4e5InterfaceListExercicio;

public class Nomes implements Comparable<Nomes>{
    private String nomes;

    public Nomes(String nomes) {
        this.nomes = nomes;
    }

    public String getNomes() {
        return nomes;
    }

    @Override
    public int compareTo(Nomes outroNome) {
        return this.getNomes().compareTo(outroNome.getNomes());
    }

    @Override
    public String toString() {
        return this.getNomes();
    }
}
