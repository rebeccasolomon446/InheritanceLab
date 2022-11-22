package Bakery;

import Cake.Cake;

import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<Cake> cakes;

    public String getName() {
        return name;
    }

    // METHODS

    public int countCakes() {
        return this.cakes.size();
    }

    public void addCake(Cake cake) {
        this.cakes.add(cake);
    }







    // GETTERS AND SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(ArrayList<Cake> cakes) {
        this.cakes = cakes;
    }

    public Bakery(String name) {
        this.name = name;
        this.cakes = new ArrayList<>();
    }
}
