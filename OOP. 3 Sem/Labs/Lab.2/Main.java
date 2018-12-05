package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Book book = new Book( "",  "", 0);

        Scanner sc = new Scanner(System.in);

        System.out.print("Please. enter name of the book: ");
        book.setName(sc.next());
        System.out.print("Please. enter author's name of the book: ");
        book.setAuthor(sc.next());
        System.out.print("Please. enter year of publication of the book: ");
        book.setYear(sc.nextInt());

        System.out.println(book.toString());

    }
}

