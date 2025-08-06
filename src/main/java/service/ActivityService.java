package service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import controller.MatchActivity;
import model.Acitivity;
import model.Wheater;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;
import java.util.Random;

public class ActivityService {

    MatchActivity matchActivity=new MatchActivity();

    private final String apiKey="https://bored-api.appbrewery.com/filter?type=";

    public Optional<Acitivity> findActivityByTipe(Wheater wheater){

        Acitivity activity=null;
        String activityInput =  matchActivity.matchingActivity(wheater).toString();

        try {
            URL url=new URL(apiKey.concat(activityInput));
            HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            if (!(connection.getResponseCode()== HttpURLConnection.HTTP_OK)){
                throw new RuntimeException("Page not Found");
            }else {
                 String line;
                 StringBuilder stringBuilder=new StringBuilder();
                BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while ((line=reader.readLine())!=null){
                    stringBuilder.append(line);
                }
                reader.close();
                JsonArray activityResponse= JsonParser.parseString(stringBuilder.toString()).getAsJsonArray();
                Random random=new Random();
                int num= random.nextInt(activityResponse.size());
                JsonObject singleActivity=activityResponse.get(num).getAsJsonObject();
                activity=new Acitivity(singleActivity.get("activity").getAsString());

                return Optional.of(activity);

            }
        }catch (Exception exception){
            throw new RuntimeException();
        }

    }

}
