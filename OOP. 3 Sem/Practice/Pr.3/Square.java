package ru.mirea;

public class Square extends Rectangle {
    private double side;

    public  Square(){
        side = 0;
        color = " ";
        filled = false;
    }

    public Square(double s){
        side = s;
        color = " ";
        filled = false;
    }

    public Square(double s, String c, boolean f){
        side = s;
        color = c;
        filled = f;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){ return side*side; }

    public double getPerimeter(){ return side*4; }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "side: " + side + "; color: " + color + "; is filled " + filled;
    }
}
