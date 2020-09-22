package ru.mirea.lab5;

import java.awt.*;
import java.util.Random;

public class Line extends Shape {
    public Line(int x, int y, Color color) {
        super(x, y, color);
    }
    @Override
    public void draw2(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        Random r=new Random();
        g2.drawLine(getX(),getY(),(r.nextInt(500)),r.nextInt(500));
    }
}