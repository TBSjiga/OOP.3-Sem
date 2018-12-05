package ru.mirea;

class Car implements Print {
    private String name;

    public String getName() {
        return name;
    }

    Car(String name){
        this.name = name;
    }

    public void print() {
        System.out.printf("Car: %s\n", name);
    }
}
