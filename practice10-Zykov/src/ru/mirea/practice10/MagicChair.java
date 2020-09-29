package ru.mirea.practice10;

public class MagicChair extends ChairFactory implements Chair {
    public void doMagic(){
        System.out.println("Maaagic");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}