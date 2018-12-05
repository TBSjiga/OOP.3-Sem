package ru.mirea;

public abstract class Furniture{
    private String name;
    private int price;
    private String material;

    public Furniture(String name, int price, String material){
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public String getName(){
        return  name;
    }

    public int getPrice(){
        return price;
    }

    public String getMaterial(){
        return material;
    }
}

