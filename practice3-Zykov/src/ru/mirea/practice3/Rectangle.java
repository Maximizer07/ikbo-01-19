package ru.mirea.practice3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled=true;
        this.color="WHITE";
        this.width=156;
        this.length=66.6;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", lenght: "+this.length+" , color:"+super.color+" , filled: "+super.filled;
    }
}
