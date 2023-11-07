package dacd.gonzalez.control;

import com.google.gson.Gson;
import dacd.gonzalez.model.List;
import dacd.gonzalez.model.Weather;
import org.jsoup.Jsoup;

import java.time.Instant;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try{
            String url = "https://api.openweathermap.org/data/2.5/forecast?lat=27.99243&lon=-15.41915&appid=51cb3b621914382d96a450c0f3451582";
            String jsonString = Jsoup.connect(url).ignoreContentType(true).execute().body();

            Gson gson = new Gson();
            List climateList = gson.fromJson(jsonString, List.class);

            System.out.println(
                    "name:" + climateList.getCity().getName() + "\n" +
                    "lat:" + climateList.getCity().getCoord().getLat() + "\n" +
                    "lon:" + climateList.getCity().getCoord().getLon()  + "\n");

            for (Weather weather: climateList.getList()) {

                long unitTime = weather.getDt();
                Instant instant = Instant.ofEpochSecond(unitTime);
                System.out.println(instant);

                System.out.println("temp:" + weather.getMain().getTemp() + "\n"
                + "humidity:" + weather.getMain().getHumidity() + "\n"
                + "clouds:" + weather.getClouds().getAll() + "\n"
                + "wind:" + weather.getWind().getSpeed() + "\n"
                );

                if (weather.getRain() != null ){
                    System.out.println("Rain:" + weather.getRain().getPop() + "\n");
                }else {
                    System.out.println("Not rain detected" + "\n");
                }

            }








        }catch (Exception e){
            e.printStackTrace();
        }

    }
}