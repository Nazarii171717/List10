package task1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        //FirstMovie
        CastMember castMember1 = new CastMember("Leonardo DiCaprio", "Jordan Belfort");
        CastMember castMember2 = new CastMember("Margot Robbie", "Naomi Lapaglia");
        ArrayList<CastMember> list1 = new ArrayList<>();
        list1.add(castMember1);
        list1.add(castMember2);
        Movie movie1 = new Movie("Wolf of Wall Street", "Martin Scorsese", 3, list1);
        //SecondMovie
        CastMember castMember3 = new CastMember("Brad Pitt", "Joe Black");
        CastMember castMember4 = new CastMember("Clarie Forlani", "Susan Parrish");
        ArrayList<CastMember> list2 = new ArrayList<>();
        list2.add(castMember3);
        list2.add(castMember4);
        Movie movie2 = new Movie("Meet Joe Black", "Martin Brest", 2, list2);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String movie1json = gson.toJson(movie1);
        System.out.println(movie1json);

        String movie2json = gson.toJson(movie2);
        System.out.println(movie2json);
    }
}