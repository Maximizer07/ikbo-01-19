package ru.mirea.lab3;

public abstract class Dog {
    private String name;
    private int age,weight;

    public Dog(String name, int age, int weight)
    {
        this.name=name;
        this.age= age;
        this.weight= weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
    public abstract void bark();

    @Override
    public String toString(){
        return ", name: "+name+", age: "+age+", weight: "+weight;
    }
}
