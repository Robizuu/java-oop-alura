package Aula1_1PessoaExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = new Pessoa();
        Pessoa pessoaTres = new Pessoa();
        Pessoa pessoaQuatro = new Pessoa();
        ArrayList<Pessoa> arrayPessoas = new ArrayList<>();

        pessoaUm.setNome("Gabriel");
        pessoaUm.setIdade(21);
        pessoaDois.setNome("Miguel");
        pessoaDois.setIdade(20);
        pessoaTres.setNome("Gustavo");
        pessoaTres.setIdade(20);
        pessoaQuatro.setNome("Felipe");
        pessoaQuatro.setIdade(21);

        arrayPessoas.add(pessoaUm);
        arrayPessoas.add(pessoaDois);
        arrayPessoas.add(pessoaTres);
        arrayPessoas.add(pessoaQuatro);

        System.out.println("A lista tem " + arrayPessoas.size() + " pessoas.");
        System.out.println("A primeira pessoa da lista é " + arrayPessoas.get(0));
        System.out.println(arrayPessoas);

    }
}
