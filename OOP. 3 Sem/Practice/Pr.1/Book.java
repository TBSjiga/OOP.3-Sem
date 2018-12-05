package ru.mirea;
import java.lang.String;

public class Book {
    private String name;
    private  String author;

    public Book(String n, String a){
        name = n;
        author = a;
    }

    public Book(){
        name = " ";
        author = " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public  String toString(){
        return "Name of book: " + this.name + ", author: " + this.author;
    }

    public void PrintInfo(){
        System.out.println(toString());
    }
}
