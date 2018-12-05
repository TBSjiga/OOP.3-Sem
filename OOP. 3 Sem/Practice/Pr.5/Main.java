package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    System.out.println("Enter the number: ");
        int number = in.nextInt();

        Turn(number);
    }

    public static int Turn(int number){
        if( number == 0){
            return 0;
        }
        System.out.print(number%10);
        return Turn(number/10);
    }
}
