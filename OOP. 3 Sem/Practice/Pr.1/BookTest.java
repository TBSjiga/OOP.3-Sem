package ru.mirea;
import java.lang.String;

public class BookTest {

    public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book();
    b1.setName("Metro2033");
    b1.setAuthor("Gluhovsky");
    b2.setName("HarryPotter");
    b2.setAuthor("Rowling");
    b1.PrintInfo();
    b2.PrintInfo();
    }
}
