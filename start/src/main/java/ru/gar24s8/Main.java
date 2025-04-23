package ru.gar24s8;

import ru.gar24s8.model.Animal;
import ru.gar24s8.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        System.out.println(dog.getName());
        dog.makeSound();
    }
}