package ru.mirea.practice16;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Item dish01 = new Dish(1500, "Яичница", "Блюдо, приготовляемое на сковороде из разбитых яиц");
        Item dish02 = new Dish(2050, "Круассан", "Булочка в форме полумесяца");
        Item drink01 = new Drink(50, "Сок", "Яблочный свежевыжатый сок");
        Item drink02 = new Drink(100, "Кофе", "Молотый черный кофе");

        Order order01 = new RestaurantOrder();
        order01.add(dish01);
        order01.add(drink01);
        System.out.println("Заказ №1:");
        System.out.println(Arrays.toString(order01.sortedItemsByCostDesc()));

        Order order02 = new InternetOrder();
        order02.add(dish02);
        order02.add(drink02);
        System.out.println("Заказ №2:");
        System.out.println(Arrays.toString(order02.sortedItemsByCostDesc()));

        InternetOrder order03 = new InternetOrder();
        order03.add("Москва", order02);
        order03.add("Москва", drink01);
        System.out.println("Заказ №3:");
        order03.getOrders();

        System.out.println(Arrays.toString(order01.getItems()));

        order01.add(dish02);
        System.out.println("Добавить предметы в заказ №1:");
        System.out.println(Arrays.toString(order01.getItems()));
        System.out.println("Число предметов в заказе №1: " + order01.numOfOrders());
        System.out.println("Итоговая сумма заказа №1: " + order01.costTotal());
        order01.remove("Яичница");
        System.out.println(Arrays.toString(order01.itemsNames()));
        order01.add(drink01);
        order01.add(drink01);
        System.out.println(Arrays.toString(order01.itemsNames()));
        System.out.println("Удалено: " + order01.removall("Сок"));
        System.out.println(Arrays.toString(order01.itemsNames()));
    }
}
