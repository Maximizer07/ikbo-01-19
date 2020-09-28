package ru.mirea.practice8;

public class Main {

    public static void main(String[] args) {
        // write your code here
        WaitList<Integer> iw=new WaitList<>();
        UnfairWaitList<Integer>u=new UnfairWaitList<>();
        BoundedWaitList<Integer>b=new BoundedWaitList<>(2);
        for(int i=0;i<5;i++){
            iw.add(i);
            u.add(i);
            if(i<2){
                b.add(i);
            }
        }

        u.moveToBack(u.remove());

        System.out.println(iw.toString()+" "+iw.contains(22));
        System.out.println(b.toString());
        System.out.println(u.toString());

    }
}