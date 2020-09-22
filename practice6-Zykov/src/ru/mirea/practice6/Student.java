package ru.mirea.practice6;
import java.util.ArrayList;

public class Student {
    private int id, kurs;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", kurs=" + kurs +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public Student(int id,  String name,int kurs) {
        this.id = id;
        this.kurs = kurs;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
