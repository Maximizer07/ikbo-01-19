package ru.mirea.lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10,167);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        circle.setRadius(14);
        circle.setColor(129);
        System.out.println(circle);
    }
}
