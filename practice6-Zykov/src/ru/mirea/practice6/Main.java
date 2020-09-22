package ru.mirea.practice6;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> array = new ArrayList<Student>();
        array.add(new Student(1010, "Maxim", 2));
        array.add(new Student(456, "Nikita", 4));
        array.add(new Student(123, "Ivan", 3));
        array.add(new Student(936, "Nickola", 3));
        array.add(new Student(345, "Victor", 2));
        array.add(new Student(835, "Michael", 2));
        array.add(new Student(910, "Alex", 1));
        Compare(array);
        for(Student str: array){
            System.out.println(str);
        }
    }
    public static void  Compare(ArrayList<Student>array){
        Student f;
        for (int left = 0; left < array.size(); left++) {
            // Вытаскиваем значение элемента
            int value = array.get(left).getId();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array.get(i).getId()) {
                    f=array.get(i+1);
                    array.set(i+1,array.get(i));
                    array.set(i,f);
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            f= array.get(i + 1);
            f.setId(value);
            array.set(i+1,f);
        }
    }
}
