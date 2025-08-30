package Aula2_1PessoaRecordExercicio;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String jsonExemplo = "{\"nome\":\"Gabriel\",\"idade\":20,\"cidade\":\"São Paulo\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonExemplo, Pessoa.class);

        System.out.println(pessoa);


    }
}
