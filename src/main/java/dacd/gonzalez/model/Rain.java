package dacd.gonzalez.model;

import com.google.gson.annotations.SerializedName;

public class Rain {


    private final Double pop;

    public Rain(Double pop) {
        this.pop = pop;
    }

    public Double getPop() {
        return pop;
    }
}
