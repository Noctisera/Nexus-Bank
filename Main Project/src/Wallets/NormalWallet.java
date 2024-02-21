package Wallets;

import Users.User;

import java.util.Date;

public class NormalWallet extends Wallet {
    public NormalWallet(User owner, Date currentDate) {
        super(owner, currentDate);
    }
}
