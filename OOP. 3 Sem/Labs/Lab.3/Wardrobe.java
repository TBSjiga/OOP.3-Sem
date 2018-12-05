package ru.mirea;

public class Wardrobe extends Furniture {
    private int height;
    private int width;

    public Wardrobe(String name, int price, String material) {
        super(name, price, material);
    }

    public Wardrobe(String name, int price, String material, int height, int width){
        super(name, price, material);
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getwidth(){
        return width;
    }

    public void display_Info(){
        System.out.println("Name: " + super.getName() + " Price: " + super.getPrice() + " Material: " + super.getMaterial() + " Height: " + height + " Width: " + width);
    }
}
