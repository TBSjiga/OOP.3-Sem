package ru.mirea;

public class Journal implements Print {
    private String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print() {
        System.out.printf("Journal: %s\n", name);
    }
}
