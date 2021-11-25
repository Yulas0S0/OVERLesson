package com.company;

public class Cream extends Cosmetics{
    private String viscosity;
    private String smell;

    public Cream (String nameBrand,double prise,boolean isNatural,int date,String viscosity,String smell){
        super(nameBrand,prise,isNatural,date);
        this.viscosity=viscosity;
        this.smell=smell;
    }
    @Override
    public void instruction(){
        System.out.println("fgbdfg");
}
    public String getViscosity() {
        return viscosity;
    }

    public String getSmell() {
        return smell;
    }


    @Override
    public String toString() {
        return super.toString()+"Cream{" +
                "viscosity='" + viscosity + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
