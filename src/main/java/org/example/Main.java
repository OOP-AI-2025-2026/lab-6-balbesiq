    package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("kotiq");
        Dog dog = new Dog("sabaq");

        System.out.println(dog.getName() + ": ");
        dog.makeSound();

        System.out.println(cat.getName() + ": ");
        cat.makeSound();
    }
}

