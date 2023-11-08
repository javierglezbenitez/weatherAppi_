package dacd.gonzalez.model;

public class List {


    private final Main main;

    private final Cloud clouds;


    private final Wind wind;

    private final int dt;

    private final Double pop;


    public List(Main main, Cloud clouds, Wind wind, int dt, Double pop) {
        this.main = main;
        this.clouds = clouds;
        this.wind = wind;
        this.dt = dt;
        this.pop = pop;
    }

    public Main getMain() {
        return main;
    }

    public Cloud getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public int getDt() {
        return dt;
    }

    public Double getPop() {
        return pop;
    }
}
