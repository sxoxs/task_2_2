package com.company;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Tiger tiger = new Tiger("Полосатик", 3);
        Giraffe giraffe = new Giraffe("Вышка", 5);
        Lion lion = new Lion();

        lion.setName("Лёва");
        lion.setAge(4);
        lion.sleep();
        tiger.eat();

        zoo.setGiraffe(giraffe);
        zoo.setLion(lion);
        zoo.setTiger(tiger);

        System.out.println(zoo.toString());
    }
}
