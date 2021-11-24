package com.company;

public class Bronzator extends Powder{
    private String xzxz;

    public Bronzator(String nameBrand, double price, boolean isNaturalIngridients, int expirationDate, String color, boolean isMatiryuchaia,String xzxz) {
        super(nameBrand, price, isNaturalIngridients, expirationDate, color, isMatiryuchaia);
        this.xzxz=xzxz;
    }

    public String getXzxz() {
        return xzxz;
    }

    @Override
    public String toString() {
        return super.toString()+ "Bronzator{" +
                "xzxz='" + xzxz + '\'' +
                '}';
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }
}
