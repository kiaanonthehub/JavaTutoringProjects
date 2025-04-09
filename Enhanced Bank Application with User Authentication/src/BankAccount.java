/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiaanmaharaj
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String pin;
    private Person accountHolder;
    
    public BankAccount(String accountNumber, String pin, Person accountHolder) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    
    // Authentication method
    public boolean authenticate(String accountNumber, String pin) {
        return this.accountNumber.equals(accountNumber) && this.pin.equals(pin);
    }
    
    // Transaction methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: R" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    
    // Getters
    public double getBalance() { return balance; }
    public Person getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    
    // Print receipt
    public void printReceipt() {
        System.out.println("\n=== BANK RECEIPT ===");
        System.out.println("Account Holder: " + accountHolder.getName());
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: R" + balance);
        System.out.println("===================\n");
    }
}
