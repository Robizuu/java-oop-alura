package Aula1_2CoinGeckoExercicio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a criptomoeda desejada: ");
        var criptomoeda = leitura.nextLine();
        System.out.println("Digite a cotação desejada: ");
        var cotacao = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=" + cotacao;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
