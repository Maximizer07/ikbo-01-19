package ru.mirea.lab5;
import java.awt.*;
import java.util.Random;

public class Circle extends Shape {
    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }
    @Override
    public void draw2(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        Random r=new Random();
        g2.fillOval(getX(),getY(),(int)(r.nextInt(100)),(int)r.nextInt(100));
    }
}
