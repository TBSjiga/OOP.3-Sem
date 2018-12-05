package ru.mirea;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Furniture furniture = new Chair("Chair", 2999, "Pine", 180);
        Furniture furniture1 = new Table("Table", 3499, "Oak", 12 , 3);
        Furniture furniture2 = new Wardrobe("Wardrobe", 4995, "Oak", 200, 160);

        ((Wardrobe) furniture2).display_Info();
        ((Table) furniture1).display_Info();
        ((Chair) furniture).display_Info();

    }
}
