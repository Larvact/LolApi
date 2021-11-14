package tobyg.api.request;

import tobyg.api.client.LolHttpClient;
import tobyg.properties.LolApiProperty;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public class HttpSummonerRequest {


    public HttpResponse<String> getHttpResponse() throws ExecutionException, InterruptedException {
        HttpRequest summonerRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Larvact")).header("X-Riot-Token", LolApiProperty.getPropertyValue(LolApiProperty.Key.DEVELOPMENT_API_KEY)).build();
        return LolHttpClient.getHttpClient().sendAsync(summonerRequest, HttpResponse.BodyHandlers.ofString()).get();
    }


}
