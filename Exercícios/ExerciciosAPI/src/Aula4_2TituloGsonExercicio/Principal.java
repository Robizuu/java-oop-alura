package Aula4_2TituloGsonExercicio;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        Titulo pessoaGabriel = new Titulo("Gabriel","São José dos Campos",21);

        Gson gson = new Gson();

        String json = gson.toJson(pessoaGabriel);

        System.out.println(json);
    }
}
