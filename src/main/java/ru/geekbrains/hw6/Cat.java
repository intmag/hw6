package ru.geekbrains.hw6;

public class Cat extends Animal {
    protected static final double SWIM_DISTANCE = 0;
    protected static final double RUN_DISTANCE = 200;
    protected static final String SUBSPECIES_M = "Котик";
    protected static final String SUBSPECIES_F = "Кошечка";
    protected static int catCount = 0;

    public Cat(String name, char gender) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE, (gender == 'm') ? SUBSPECIES_M : SUBSPECIES_F);
        setCatCount();
    }

    protected static void setCatCount() {
        Cat.catCount += 1;
    }

    public static int getCatCount() {
        return catCount;
    }
}
