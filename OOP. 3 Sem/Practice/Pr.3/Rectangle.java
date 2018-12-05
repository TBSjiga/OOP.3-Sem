package ru.mirea;
import java.lang.String;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0;
        length = 0;
    }

    public Rectangle(double w, double l){
        width = w;
        length = l;
    }

    public  Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public  double getArea(){
        return width * length / 2;
    }

    public double getPerimeter(){
        return width + length ;
    }

    public String toString() {
        return "width: " + width + "; length: " + length + "; color: " + color + "; is filled " + filled;
    }
}
