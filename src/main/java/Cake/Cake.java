package Cake;

public abstract class Cake {

    protected String name;
    protected String baseFlavour;
    protected Integer calories;

    public Cake(String name, String baseFlavour, Integer calories) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.calories = calories;
    }

    // Getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }

    public Integer getCalories() {
        return this.calories;
    }
}
