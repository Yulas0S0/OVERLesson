package com.company;

public class Cosmetics {
    private String nameBrand;
    private double price;
    private boolean isNaturalIngridients;
    private int expirationDate;


    public Cosmetics(String nameBrand,double price,boolean isNaturalIngridients,int expirationDate){
        this.nameBrand=nameBrand;
        this.price=price;
        this.isNaturalIngridients=isNaturalIngridients;
        this.expirationDate=expirationDate;
    }

    public void instruction(){
        System.out.println("Бери и используй");
    }

    public void util(){
        System.out.println("Бери и выкидывай");
    }



    public String getNameBrand() {
        return nameBrand;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNaturalIngridients() {
        return isNaturalIngridients;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "nameBrand='" + nameBrand + '\'' +
                ", price=" + price +
                ", isNaturalIngridients=" + isNaturalIngridients +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
