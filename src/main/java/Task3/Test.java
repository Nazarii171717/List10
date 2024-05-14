package Task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

public class Test {

    public static Joke convertToJoke(String bodyOfResponse)
    {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        Joke joke = gson.fromJson(bodyOfResponse, Joke.class);
        return joke;
    }
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        JokeApiClient jokeApiClient = new JokeApiClient();
        System.out.println(convertToJoke(jokeApiClient.sendGETRequest()).toString());
    }
}
