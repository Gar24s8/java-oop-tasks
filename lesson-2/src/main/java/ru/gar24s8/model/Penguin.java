package ru.gar24s8.model;

public class Penguin extends Bird implements Swimmable {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Penguin(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void swim() {
        System.out.println("I swim!");
    }
}
