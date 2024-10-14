import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public Monedas buscarMonedas(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/86c62dad993798dd19b7a583/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversion = jsonObject.getAsJsonObject("conversion_rates");

            Monedas monedas = gson.fromJson(conversion,Monedas.class);

            return monedas;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No encontre la moneda");
        }
    }
}
