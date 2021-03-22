package ru.geekbrains.hw6;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Барсик", 'm');
        cat1.run(250.1);
        Animal cat2 = new Cat("Чарли", 'm');
        cat2.run(500);
        cat2.swim(3);
        Animal cat3 = new Cat("Маркиза", 'f');
        cat3.run(0);
        System.out.println("Всего животных: " + Cat.getAnimalCount());
        System.out.println("Всего кошачих: " + Cat.getCatCount());
        Animal dog1 = new Dog("Келли", 'f');
        Animal dog2 = new Dog("Полкан", 'm');
        Animal dog3 = new Dog("Шарик", 'm');
        dog1.swim(10);
        dog2.run(450);
        dog3.swim(20);
        System.out.println("Всего животных: " + Cat.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

    }
}
