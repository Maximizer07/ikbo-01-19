package ru.mirea.practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(50, 50);
        System.out.println(b);
        b.move(10, 25);
        System.out.println(b);
    }
}