package dacd.gonzalez.model;

import java.util.ArrayList;

public class City {

    private  final String name;

    private final Coord coord;

    public City(String name, Coord coord) {
        this.name = name;
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", coords=" + coord.toString() +
                '}';
    }
}
