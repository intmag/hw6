package ru.geekbrains.hw6;

public abstract class Animal {
    protected String name;
    protected double runDistance;
    protected double swimDistance;
    protected String subspecies;
    protected static int animalCount = 0;


    public Animal(String name, double runDistance, double swimDistance, String subspecies) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.subspecies = subspecies;
        setAnimalCount();
    }

    public void swim(double swimDistance) {
        if (swimDistance < 0) {
            System.out.println("Неверное значения для заплыва!");
        } else {
            if (this.getSwimDistance() < swimDistance) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " не может проплыть дистанцию в " + swimDistance + " м.");
            } else if (getSwimDistance() >= swimDistance && swimDistance > 0) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " успешно проплыл дистанцию в " + swimDistance + " м.!");
            } else if (swimDistance <= 0) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " ничего не делает...");
            }
        }
    }

    public void run(double runDistance) {
        if (runDistance < 0) {
            System.out.println("Неверное значения для бега!");
        } else {
            if (this.getRunDistance() < runDistance) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " не может пробежать дистанцию в " + runDistance + " м.");
            } else if (getRunDistance() >= runDistance && runDistance > 0) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " успешно пробежал дистанцию в " + runDistance + " м.!");
            } else if (runDistance <= 0) {
                System.out.println(getSubspecies() + " по имени " + this.getName() + " ничего не делает...");
            }
        }
    }

    public double getSwimDistance() {
        return swimDistance;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    protected static void setAnimalCount() {
        Animal.animalCount += 1;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public double getRunDistance() {
        return runDistance;
    }
}
