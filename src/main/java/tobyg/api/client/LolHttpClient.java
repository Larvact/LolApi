package tobyg.api.client;

import tobyg.properties.LolApiProperty;

import java.net.http.HttpClient;
import java.time.Duration;

public class LolHttpClient {

    private static HttpClient httpClient;

    private LolHttpClient() {
    }

    public static HttpClient getHttpClient(){
        if(httpClient == null){
            setHttpClient();
        }
        return httpClient;
    }

    private static void setHttpClient(){
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(Long.parseLong(LolApiProperty.getPropertyValue(LolApiProperty.Key.TIMEOUT)))).build();
    }
}
