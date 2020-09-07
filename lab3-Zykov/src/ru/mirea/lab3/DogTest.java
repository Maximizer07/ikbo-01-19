package ru.mirea.lab3;

public class DogTest {
    public static void main(String[] args) {
        Spaniel spaniel = new Spaniel("Woody",5,25,10);
        Beagle beagle = new Beagle("Mickey",3,5,"white");
        spaniel.bark();
        beagle.bark();
        System.out.println(spaniel);
        System.out.println(beagle);
        spaniel.setLength(13);
        beagle.setColoring("black");
        System.out.println(spaniel);
        System.out.println(beagle);
    }
}
