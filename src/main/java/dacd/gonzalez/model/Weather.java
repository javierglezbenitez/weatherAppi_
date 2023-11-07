package dacd.gonzalez.model;

import java.time.Instant;

public class Weather {
    private final Parameter main;

    private final Cloud clouds;

    private final Rain rain;

    private final Wind wind;

    private final int dt;


    public Weather(Parameter main, Cloud clouds, Rain rain, Wind wind, int dt) {
        this.main = main;
        this.clouds = clouds;
        this.rain = rain;
        this.wind = wind;
        this.dt = dt;
    }

    public Parameter getMain() {
        return main;
    }

    public Cloud getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Wind getWind() {
        return wind;
    }

    public int getDt() {
        return dt;
    }
}
