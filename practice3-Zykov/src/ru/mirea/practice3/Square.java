package ru.mirea.practice3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side){
        this.width=side;
        this.length=side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(this.width);
        super.setLength(this.length);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(this.width);
        super.setLength(this.length);
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+getSide()+" , color:"+super.color+" , filled: "+super.filled;
    }
}
