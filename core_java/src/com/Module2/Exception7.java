package com.Module2.copy;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Exception7 {
    private int balance = 2000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Sorry, insufficient balance. You need more " + (amount - balance) + " Rs. to perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Transaction successful! Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Exception7 account = new Exception7();
        try {
            account.withdraw(2500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
