package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exceptions.ConvertErrorYearException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleDTO;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome de filme: ");
        var search = scanner.nextLine();

        String apiKey = "637876a6";
        String uri = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + apiKey;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

            String json = response.body();
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TitleDTO titleDTO = gson.fromJson(json, TitleDTO.class);
            System.out.println(titleDTO);
            Title myTitle = new Title(titleDTO);
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("algum erro de argumento na busca, verifique o endereco");
        } catch (ConvertErrorYearException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O programa encerrou corretamente");
        }
    }
}
