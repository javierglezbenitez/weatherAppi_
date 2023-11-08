package dacd.gonzalez.model;

import java.time.Instant;
import java.util.ArrayList;

public class Weather {
    private final ArrayList<List> list;


    public Weather(ArrayList<List> list) {
        this.list = list;
    }

    public ArrayList<List> getList() {
        return list;
    }
}
