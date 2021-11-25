package com.company;

public class Highlighter extends Powder{
    private String xz;

    public String getXz() {
        return xz;
    }

    @Override
    public String toString() {
        return super.toString()+"Highlighter{" +
                "xz='" + xz + '\'' +
                '}';
    }

    public Highlighter(String nameBrand, double price, boolean isNaturalIngridients, int expirationDate, String color, boolean isMatiryuchaia, String xz) {
        super(nameBrand, price, isNaturalIngridients, expirationDate, color, isMatiryuchaia);
    this.xz=xz;

    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }
}
