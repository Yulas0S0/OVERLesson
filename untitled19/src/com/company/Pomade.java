package com.company;

public class Pomade extends Cosmetics{
    private String color;

    public Pomade(String nameBrand, double price, boolean isNaturalIngridients, int expirationDate,String color) {
        super(nameBrand, price, isNaturalIngridients, expirationDate);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString()+"Pomade{" +
                "color='" + color + '\'' +
                '}';
    }
}
