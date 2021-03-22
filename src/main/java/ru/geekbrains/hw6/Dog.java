package ru.geekbrains.hw6;

public class Dog extends Animal {
    protected static final double SWIM_DISTANCE = 10;
    protected static final double RUN_DISTANCE = 500;
    protected static final String SUBSPECIES_M = "Собакен";
    protected static final String SUBSPECIES_F = "Собачка";
    protected static int dogCount = 0;

    public Dog(String name, char gender) {
        super(name, RUN_DISTANCE, SWIM_DISTANCE, (gender == 'm') ? SUBSPECIES_M : SUBSPECIES_F);
        setDogCount();
    }

    protected static void setDogCount() {
        Dog.dogCount += 1;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
