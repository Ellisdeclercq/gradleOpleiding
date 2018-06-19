package com.ellisdeclercq.thuisoefenen;

public class BankAccount {

    private int accountNumber;
    private double balance;


    public BankAccount (int anAccountNumber) {
        accountNumber = anAccountNumber;
        balance = 0;
    }
    public BankAccount (int anAccountNumber, double initialBalance)
    {
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }
    public void deposit(double amount)
    {
    double newBalance = balance + amount;
    balance = newBalance;
    }
    public void withdraw(double amount)
    {
     double newBalance = balance - amount;
     balance = newBalance;
    }
    public double getBalance()
    {
      return balance;
    }

    public static void main(String[] args) {
        BankAccount Ellis = new BankAccount(40685, 45.10);
        Ellis.withdraw(10);
        Ellis.deposit(14.7);
        double eindstand = Ellis.getBalance();
        System.out.println(eindstand);

    }

}
