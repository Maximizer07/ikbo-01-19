package ru.mirea.practice5;
import java.util.Scanner;

public class Main{
    public static int Ten(int a,int b){
        if(a>0){
            b=10*b+a%10;
            a/=10;
            return Ten(a,b);
        }
        else{
            return b;
        }
    }
    public static int Eleven() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0){
            int m = in.nextInt();
            if (m==0) return 0;
            else return Eleven()+1;
        }
        else if (n==1) {
            return Eleven()+1;
        }
        return Eleven();
    }
    public static int Nine(int a, int b) {
        if (a==0) return 1;
        if (a==1) return b+1;
        if (a>1&&b==0) return 0;
        return Nine(a, b - 1) + Nine(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Nine nine = new Nine();
        System.out.println(Ten(653128,0));
        System.out.println(Eleven());
        System.out.println(Nine(2,2));
    }
}
