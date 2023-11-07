package dacd.gonzalez.model;

public class Parameter {
    private final double temp;
    private final int humidity;


    public Parameter(double temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return "main{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
