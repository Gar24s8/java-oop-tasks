package ru.gar24s8;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("1", 42312.54);

        try{
            double amount = 123.43;
            account.withDraw(amount);
            System.out.println("Снятие " + amount + " Новый баланс: " + account.getBalance());
        } catch (RuntimeException e) {
            System.out.println("ERROR! " + e.getClass() + " " + e.getMessage());
        }
    }
}