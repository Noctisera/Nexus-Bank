package Wallets;

import Users.User;

import java.util.Date;

public abstract class Wallet {
    private final User owner;
    private final Integer cardNumber;
    private final Integer cvv;
    private final Date expiryDate;
    private double balance; // TODO: Implement different currency types

    public Wallet(User owner, Date currentDate) {
        this.owner = owner;
        this.cardNumber = (int) (Math.random() * 1000000000);
        this.cvv = (int) (Math.random() * 1000);
        this.expiryDate = new Date(currentDate.getTime() + 31556952000L); // 1 year in milliseconds
        this.balance = 0;
    }
}
