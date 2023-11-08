package dacd.gonzalez.control;

import com.google.gson.Gson;
import dacd.gonzalez.model.*;
import org.jsoup.Jsoup;

import java.time.Instant;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try{
            String url = "https://api.openweathermap.org/data/2.5/forecast?lat=50.5456&lon=-15.41915&appid=51cb3b621914382d96a450c0f3451582";
            String jsoup = Jsoup.connect(url).ignoreContentType(true).execute().body();

            Gson gson = new Gson();
            Weather climateList = gson.fromJson(jsoup, Weather.class);


            for (List weather: climateList.getList()) {
                long unitTime = weather.getDt();
                Instant instant = Instant.ofEpochSecond(unitTime);
                System.out.println(instant);

                System.out.println("temp:" + weather.getMain().getTemp() + "\n"
                + "humidity:" + weather.getMain().getHumidity() + "\n"
                + "clouds:" + weather.getClouds().getAll() + "\n"
                + "wind:" + weather.getWind().getSpeed() + "\n"
                + "Pop:" + weather.getPop() + "\n"
                );
            }
        }catch (Exception e){
            throw new RuntimeException();
        }

    }
}