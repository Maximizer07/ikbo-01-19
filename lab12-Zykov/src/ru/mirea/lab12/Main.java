package ru.mirea.lab12;
public class Main {
    public static void main(String[] args) {
        String[] tests = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899",
                "20/02/1900",
                "20/02/1950",
                "20/02/9999"
        };
        DateValidator check = new DateValidator();
        for (String test : tests) {
            System.out.println(check.validate(test) + "\t:" + test);
        }
    }
}