package Cake;

import Interfaces.ISell;

public abstract class Cake implements ISell {

    protected String name;
    protected String baseFlavour;
    protected Integer calories;

    public Cake(String name, String baseFlavour, Integer calories) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.calories = calories;
    }

    // METHODS
    public abstract String bake();

    // Getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String scanBarcode(int price) {
        return this.name + " costs £" +price;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }

    public Integer getCalories() {
        return this.calories;
    }
}
