package com.company;

public class Powder extends Cosmetics{
    private String color;
    private boolean isMatiryuchaia;

    public String getColor() {
        return color;
    }

    public boolean isMatiryuchaia() {
        return isMatiryuchaia;
    }

    public Powder(String nameBrand, double price, boolean isNaturalIngridients, int expirationDate, String color, boolean isMatiryuchaia) {
        super(nameBrand, price, isNaturalIngridients, expirationDate);
        this.color=color;
        this.isMatiryuchaia=isMatiryuchaia;


    }

    @Override
    public String toString() {
        return super.toString()+"Powder{" +
                "color='" + color + '\'' +
                ", isMatiryuchaia=" + isMatiryuchaia +
                '}';
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }
}
