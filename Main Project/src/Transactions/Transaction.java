package Transactions;

import java.util.Date;

public class Transaction {
    private String sender;
    private Integer senderWalletCode;
    private String receiver;
    private Integer receiverWalletCode;
    private double amount;
    private String currency;
    private Date date;
    private Integer transactionID;
    private String message;

    public Transaction(String sender, Integer senderWalletCode, String receiver,
                       Integer receiverWalletCode, double amount, String currency, Date date,
                       Integer transactionID, String message) {
        this.sender = sender;
        this.senderWalletCode = senderWalletCode;
        this.receiver = receiver;
        this.receiverWalletCode = receiverWalletCode;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
        this.transactionID = transactionID;
        this.message = message;
    }
}
