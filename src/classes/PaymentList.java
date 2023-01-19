package classes;

import interfaces.TransactionList;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList {

    private ArrayList<Transaction> allTransactions;

    @Override
    public Transaction getLastTransaction() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return null;
    }
}
