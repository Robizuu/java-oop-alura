package Aula2_2GSONExercicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        String jsonExemplo = "{\"nome\":\"Gabriel\",\"idade\":20,\"cidade\":\"São Paulo\",\"Bairro\":\"Piroca\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonExemplo, Pessoa.class);

        System.out.println(pessoa);


    }
}
