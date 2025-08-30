package Aula1_1GoogleBooksExercicio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        System.out.println("Escreva o livro de seu interesse: ");
        var escolhaUsuario = entrada.nextLine();

        String chave = "sua chave aqui";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + escolhaUsuario + "&key=" + chave;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
