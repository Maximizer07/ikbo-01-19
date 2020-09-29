package ru.mirea.practice10;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
}
