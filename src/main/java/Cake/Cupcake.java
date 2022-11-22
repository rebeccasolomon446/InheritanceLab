package Cake;

import java.util.ArrayList;

public class Cupcake extends Cake {

    private ArrayList<String> toppings;
    private String fillingFlavour;



    public Cupcake(String name, String baseFlavour, Integer calories, String fillingFlavour) {
        super(name, baseFlavour, calories);
        this.toppings =  new ArrayList<>();
        this.fillingFlavour = fillingFlavour;

    }

    // Methods

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public String cupcakeInCasing() {
        return "all cupcakes have the right size casing!";
    }
    // overloading methods
    public String addCupcakeDesign(String bakeryDesign) {
        return String.format("Our most popular cupcake design is %s", bakeryDesign);
    }

    public String addCupcakeDesign(String customerDesign, int WaiverNumber) {
        return String.format("Customer chooses to design their cupcake decor: %s. required waiver number is %s", customerDesign, WaiverNumber);
    }




    // abstract method:
    public String bake() {
        return "Cupcake bake time is 15-20 minutes";
    }

    // GETTERS AND SETTERS

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getFillingFlavour() {
        return fillingFlavour;
    }

    public void setFillingFlavour(String fillingFlavour) {
        this.fillingFlavour = fillingFlavour;
    }


}
