package com.company;
import java.lang.System;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int sum(int massive[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=massive[i];
        }
        return sum;
    }

    public static void sort(int massive[], int size) {
        for(int i = massive.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( massive[j] > massive[j+1] ) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size;
        /*Scanner*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter array's size: ");
        size=sc.nextInt();
        int[]massive=new int[size];
        System.out.print("Please, enter array: ");

        for(int i=0; i<size; i++){
            massive[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("Sum = " + sum(massive, size));

        /*Math Random*/
        for(int i=0; i<size; i++){
            massive[i] = (int)(Math.random()*1000 - Math.random()*1000);
        }
        sort(massive, size);
        System.out.print("Random array: ");
        for(int i=0; i<size; i++){
            System.out.print(massive[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Sum = " + sum(massive, size));

        /*Random*/
        Random random = new Random(1000);
        for(int i=0; i<size; i++){
            massive[i] = random.nextInt(1000);
        }
        sort(massive, size);
        System.out.print("Random sorted array: ");
        for(int i=0; i<size; i++){
            System.out.print(massive[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Sum = " + sum(massive, size));
    }
}
