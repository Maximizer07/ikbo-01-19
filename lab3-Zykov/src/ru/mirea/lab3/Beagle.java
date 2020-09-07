package ru.mirea.lab3;

public class Beagle extends Dog {
    private String coloring;

    public Beagle(String name, int age, int weight, String coloring) {
        super(name, age, weight);
        this.coloring = coloring;
    }

    public String getColoring() {
        return coloring;
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

    @Override
    public void bark() {
        System.out.println("Beagle is barking");
    }

    @Override
    public String toString() {
        return "Beagle - coloring: "+coloring+super.toString();
    }
}
