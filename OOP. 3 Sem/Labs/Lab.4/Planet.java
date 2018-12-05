package ru.mirea;

class Planet implements Print {
    private String name;

    public String getName() {
        return name;
    }

    Planet(String name){
        this.name = name;
    }

    public void print() {
        System.out.printf("Planet: %s\n", name);
    }
}
