package ru.mirea.practice5;

public class Nine {
    public static int f(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return f(a, b - 1) + f(a - 1, b - 1);
    }
}