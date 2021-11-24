package com.company;

public class HandCream extends Cream{
    private String moisturizeHand;


    public HandCream(String nameBrand, double prise, boolean isNatural, int date, String viscosity, String smell,String moisturizeHand) {
        super(nameBrand, prise, isNatural, date, viscosity, smell);
        this.moisturizeHand=moisturizeHand;
    }

    public String getMoisturizeHand() {
        return moisturizeHand;
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }
    @Override
    public String toString() {
        return super.toString()+"HandCream{" +
                "moisturizeHand='" + moisturizeHand + '\'' +
                '}';
    }
}
