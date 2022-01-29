package my.httpexample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {

    //public static final String URL_GET = "https://jsonplaceholder.typicode.com/post"; // url
    public static final String URL_GET = "https://httpbin.org/get"; // url

    public static void main(String[] args) throws IOException, InterruptedException {

        // Instancia um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Cria a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build();

        // Enviando uma solicitação
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprime conteudo recebido
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}
