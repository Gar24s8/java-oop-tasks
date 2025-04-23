package ru.gar24s8;

import ru.gar24s8.model.Penguin;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("hi!");
        penguin.fly();
        penguin.swim();
    }
}