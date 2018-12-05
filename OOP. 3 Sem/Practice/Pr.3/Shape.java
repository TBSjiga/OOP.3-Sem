package ru.mirea;
import java.lang.String;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = " ";
        filled = false;
    }

    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(boolean filled) {
        return filled;
    }

    abstract double getArea();
    abstract  double getPerimeter();

    public String toString(){
        return "color: " + color + "; is filled " + filled;
    }
}