package ru.mirea.lab8;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для записи в файл");
        String text = in.nextLine();
        try (FileWriter writer = new FileWriter("C:\\Downloads\\file.txt", false))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}