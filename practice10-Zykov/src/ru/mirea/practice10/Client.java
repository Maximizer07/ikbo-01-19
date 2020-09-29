package ru.mirea.practice10;

public class Client implements Chair {
    public Chair chair;
    public void sit(){
        System.out.println("Sit on "+ chair);
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
