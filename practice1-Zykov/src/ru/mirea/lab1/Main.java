package ru.mirea.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog dog=new Dog();
        Ball ball=new Ball();
        Book book=new Book();
        dog.setAge(in.nextInt());
        ball.setRadius(in.nextInt());
        book.setName(in.next());
        System.out.println(dog.toString()+"\n"+ball.toString()+"\n"+book.toString());
    }
}
