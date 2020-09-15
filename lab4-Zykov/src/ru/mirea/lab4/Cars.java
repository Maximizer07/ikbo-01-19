package ru.mirea.lab4;

public class Cars implements Nameable{
    private String name;
    Cars(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
