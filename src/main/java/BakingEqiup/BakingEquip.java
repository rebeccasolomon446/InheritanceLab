package BakingEqiup;

import Interfaces.ISell;

public class BakingEquip implements ISell {

    private String name;

    public BakingEquip(String name) {
        this.name = name;
    }

    public String scanBarcode(int price) {
        return this.name + " costs £" +price;
    }

}
