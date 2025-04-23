package ru.gar24s8;

public class Account {
    private String id;
    private Double balance;

    public Account(String id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("меньше нуля");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("снимаешь больше, чем есть");
        }
        balance -= amount;
    }
}
