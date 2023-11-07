package dacd.gonzalez.model;

import java.util.ArrayList;

public class List {

        private final ArrayList<Weather> list;

        private final City city;

    public List(ArrayList<Weather> list, City city) {
        this.list = list;
        this.city = city;
    }

    public ArrayList<Weather> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}
