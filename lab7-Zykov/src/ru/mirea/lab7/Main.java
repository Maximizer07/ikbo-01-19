package ru.mirea.lab7;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Audi");
        cars.add("Bmw");
        cars.addLast("Toyota");
        cars.addFirst("Nissan");
        cars.add(1, "Lamborghini"); // добавляем элемент по индексу 1
        System.out.printf("В списке %d элементов \n", cars.size());
        System.out.println(cars.get(1));
        cars.set(1, "Ferrari");
        for(String car : cars){
            System.out.println(car);
        }

        if(cars.contains("Bmw")){
            System.out.println("Список содержит автомобиль Bmw");
        }
        cars.remove("Bmw");
        cars.removeFirst(); // удаление первого элемента
        cars.removeLast(); // удаление последнего элемента
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Max"));
        people.addFirst(new Person("Dan"));
        people.addLast(new Person("Alex"));
        people.remove(1);
        for(Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}
