package Cake;

public class Cheesecake extends Cake{

    private String typeOfBase;
    private String bakeOrNoBake;

    public Cheesecake(String name, String baseFlavour, Integer calories, String typeOfBase, String bakeOrNoBake) {
        super(name, baseFlavour, calories);
        this.typeOfBase = typeOfBase;
        this.bakeOrNoBake = bakeOrNoBake;

    }

    // METHODS

    public String crushBiscuitsForBase() {
        return "crush biscuits for 1 minute.";
    }

    // METHODS

    // abstract method
    public String bake() {
        return "Cheesecakes an either be baked (25 minutes) or refrigerated.";
    }


    // GETTERS AND SETTERS

    public String getTypeOfBase() {
        return typeOfBase;
    }

    public void setTypeOfBase(String typeOfBase) {
        this.typeOfBase = typeOfBase;
    }

    public String getBakeOrNoBake() {
        return bakeOrNoBake;
    }

    public void setBakeOrNoBake(String bakeOrNoBake) {
        this.bakeOrNoBake = bakeOrNoBake;
    }










}
