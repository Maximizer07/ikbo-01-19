package ru.mirea.lab2;

public class Circle {
    private float radius;
    private float color;

    public Circle(float radius, float color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getColor() {
        return color;
    }

    public void setColor(float color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle: " + "\nRadius = " + radius + "\nColor = " + color;
    }
}
