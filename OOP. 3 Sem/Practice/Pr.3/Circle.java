package ru.mirea;
import java.lang.String;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double r){
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        radius = r;
        color = c;
        filled = f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "radius: " + radius + "; color: " + color + "; is filled " + filled;
    }
}

