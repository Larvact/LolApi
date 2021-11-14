package tobyg;


import tobyg.api.request.HttpSummonerRequest;

import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        HttpSummonerRequest request = new HttpSummonerRequest();
        try {
            System.out.println(request.getHttpResponse().body());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
