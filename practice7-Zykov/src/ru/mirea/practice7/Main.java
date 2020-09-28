package ru.mirea.practice7;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque a1=new ArrayDeque(5);
        ArrayDeque a2=new ArrayDeque(5);
        System.out.println("Введите 5 карт первого игрока");
        for (int i=0;i<5;i++){
            a1.add(in.nextInt());
        }
        System.out.println("Введите 5 карт второго игрока");
        for (int i=0;i<5;i++){
            a2.add(in.nextInt());
        }
        int i =0;
        int a,b;
        while(i<106 && !a1.isEmpty()&& !a2.isEmpty()){
            a= (int) a1.getFirst();
            b= (int) a2.getFirst();
            a1.removeFirst();
            a2.removeFirst();
            //System.out.println(a+" "+b);
            if(a==9 && b==0) {
                a2.addLast(a);
                a2.addLast(b);
                //System.out.println("Победа b");
            }
            else if (a==0 && b==9){
                a1.addLast(a);
                a1.addLast(b);
                //System.out.println("Победа a");
            }
            else {
                if(a<b){
                    a2.addLast(a);
                    a2.addLast(b);
                    //System.out.println("Победа b");
                }
                else if (a>b) {
                    a1.addLast(a);
                    a1.addLast(b);
                    //System.out.println("Победа a");
                    }
                    else {
                        a1.addLast(a);
                        a2.addLast(b);
                        //System.out.println("a==b");
                    }
                }
            i++;
            }
        if(a2.isEmpty()){
            System.out.println("first "+i);
        }
        else {
            if(a1.isEmpty()){
                System.out.println("second "+i);
            }
            else if (i<106){
                System.out.println("botva");
            }
            }
        }
}