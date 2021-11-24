package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShopCosmetics {
    private List<Cosmetics> list;
    public ShopCosmetics(List<Cosmetics>list){
        this.list=list;
    }

    public void vivodCream(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof Cream)
                System.out.println(list.get(i));
    }
    public void vivodPomade(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof Pomade)
                System.out.println(list.get(i));
    }
    public void vivodPowder(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof Powder)
                System.out.println(list.get(i));
    }
    public void vivodHighlighter(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof Highlighter)
                System.out.println(list.get(i));
    }
    public void vivodBronzator(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof Bronzator)
                System.out.println(list.get(i));
    }
    public void vivodFootCream(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof FootCream)
                System.out.println(list.get(i));
    }
    public void vivodHandCrem(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof HandCream)
                System.out.println(list.get(i));
    }
    public void vivodFaseCream(){
        for (int i=0;i<list.size();i++)
            if (list.get(i) instanceof FaceCream)
                System.out.println(list.get(i));
    }
    public List<Cosmetics> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ShopCosmetics{" +
                "list=" + list +
                '}';
    }
}
