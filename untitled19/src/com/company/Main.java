package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Cosmetics> list=new ArrayList<>();
        Cosmetics cosmetics=new Cosmetics("",5,false,5);
        Cream cream=new Cream("",5,false,5,"","");
        list.add(new Cosmetics("1",5.7,true, 3));
        list.add(new Bronzator("2",5,false, 5,"f",false,"dv"));
        list.add(new Cream("1111",896,false,3,"f","sd"));
        ShopCosmetics shopCosmetics=new ShopCosmetics(list);

    }


}
