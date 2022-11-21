package Cake;

import java.util.ArrayList;

public class Cupcake extends Cake {

    private ArrayList<String> toppings;
    private String fillingFlavour;

    public Cupcake(String name, String baseFlavour, Integer calories, ArrayList<String> toppings, String fillingFlavour) {
        super(name, baseFlavour, calories);
        this.toppings =  new ArrayList<>();
        this.fillingFlavour = fillingFlavour;

    }

}
