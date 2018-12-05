package ru.mirea;

public class Table extends Furniture {
    private int surface;
    private int number_of_cases;

    public Table(String name, int price, String material) {
        super(name, price, material);
    }

    public Table(String name, int price, String material, int surface, int number_of_cases){
        super(name, price, material);
        this.surface = surface;
        this.number_of_cases = number_of_cases;
    }

    public Table(String name, int price, int number_of_cases, String material) {
        super(name, price, material);
        this.number_of_cases = number_of_cases;
    }

    public int getSurface(){
        return surface;
    }

    public int getnumber_of_cases(){
        return number_of_cases;
    }

    public void display_Info(){
        System.out.println("Name: " + super.getName() + " Price: " + super.getPrice() + " Material: " + super.getMaterial() + " Surface: " + surface + " Number of cases: " + number_of_cases);
    }
}
