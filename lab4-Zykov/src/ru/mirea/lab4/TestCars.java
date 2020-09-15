package ru.mirea.lab4;

public class TestCars {
    public static void main(String[] args) {
        Cars toyota = new Cars("Toyota");
        System.out.println("Марка машины: "+ toyota.getName());
        Cars bmw = new Cars("BMW");
        System.out.println("Марка машины: "+ bmw.getName());
    }
}
