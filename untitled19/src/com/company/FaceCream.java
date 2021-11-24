package com.company;

public class FaceCream extends Cream{
    private String moisturizeFace;


    public FaceCream(String nameBrand, double prise, boolean isNatural, int date, String viscosity, String smell,String moisturizeFace) {
        super(nameBrand, prise, isNatural, date, viscosity, smell);
        this.moisturizeFace=moisturizeFace;
         }

    public String getMoisturizeFace() {
        return moisturizeFace;
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }

    @Override
    public String toString() {
        return super.toString()+ "FaceCream{" +
                "moisturizeFace='" + moisturizeFace + '\'' +
                '}';
    }
}
