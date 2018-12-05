package ru.mirea;
import java.util.Scanner;

public class ShapeTest{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Проверка класса Circle
        Circle circle = new Circle();
        System.out.print("Circle\n");

        System.out.print("Enter radius:\n");
        circle.setRadius(in.nextDouble());
        System.out.print("\n");

        System.out.print("Enter color:\n");
        circle.setColor(in.next());
        System.out.print("\n");

        System.out.print("Is filled? \n");
        circle.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Circle's area: \n");
        System.out.print(circle.getArea());
        System.out.print("\n");
        System.out.print("Circle's perimeter: \n");
        System.out.print(circle.getPerimeter());
        System.out.print("\n");

        System.out.print(circle);
        System.out.print("\n");
        System.out.print("\n");

        //проверка класса Rectangle

        Rectangle rec = new Rectangle();
        System.out.print("Rectangle\n");

        System.out.print("Enter wight:\n");
        rec.setWidth(in.nextDouble());
        System.out.print("\n");

        System.out.print("Enter length:\n");
        rec.setLength(in.nextDouble());
        System.out.print("\n");

        System.out.print("Enter color:\n");
        rec.setColor(in.next());
        System.out.print("\n");

        System.out.print("If filled? \n");
        rec.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Rectangle's area: \n");
        System.out.print(rec.getArea());
        System.out.print("\n");
        System.out.print("Rectangle's perimeter: \n");
        System.out.print(rec.getPerimeter());
        System.out.print("\n");

        System.out.print(rec);
        System.out.print("\n");
        System.out.print("\n");

        //проверка класса Square

        Square sq = new Square();
        System.out.print("Square\n");

        System.out.print("Enter side:\n");
        sq.setSide(in.nextDouble());
        System.out.print("\n");

        System.out.print("Enter color: \n");
        sq.setColor(in.next());
        System.out.print("\n");

        System.out.print("Is filled? \n");
        sq.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Square's area: \n");
        System.out.print(sq.getArea());
        System.out.print("\n");
        System.out.print("Square's perimeter: \n");
        System.out.print(sq.getPerimeter());
        System.out.print("\n");

        System.out.print(sq);
    }
}
