package ru.mirea.lab3;

public class Spaniel extends Dog {

    private int length;

    public Spaniel(String name, int age, int weight, int length) {
        super(name, age, weight);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void bark(){
        System.out.println("Spaniel is barking");
    }
    @Override
    public String toString(){
        return "Spaniel - length: "+length+super.toString();
    }
}
