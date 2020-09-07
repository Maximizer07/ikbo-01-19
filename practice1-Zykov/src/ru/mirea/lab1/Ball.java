package ru.mirea.lab1;

public class Ball {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Ball "+radius;
    }
}
