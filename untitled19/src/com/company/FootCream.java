package com.company;

public class FootCream extends Cream{
    private String moisturizeFoot;

    public FootCream(String nameBrand, double prise, boolean isNatural, int date, String viscosity, String smell,String moisturizeFoot) {
        super(nameBrand, prise, isNatural, date, viscosity, smell);
        this.moisturizeFoot=moisturizeFoot;
    }

    public String getMoisturizeFoot() {
        return moisturizeFoot;
    }

    @Override
    public String toString() {
        return super.toString()+"FootCream{" +
                "moisturizeFoot='" + moisturizeFoot + '\'' +
                '}';
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
    }
}
