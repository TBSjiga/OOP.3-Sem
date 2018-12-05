package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Name of Car: ");
        String name_car = in.nextLine();
        Print print1 = new Car(name_car);
        print1.print();

        System.out.print("Name of Journal: ");
        String name_journal = in.nextLine();
        Print print2 = new Journal(name_journal);
        print2.print();
        ((Journal) print2).getName();

        System.out.print("Name of Planet: ");
        String name_planet = in.nextLine();
        Print print3 = new Planet(name_planet);
        print3.print();
    }
}
