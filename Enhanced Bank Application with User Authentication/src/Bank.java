/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kiaanmaharaj
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private BankAccount currentSession;
    private Scanner scanner;
    
    public Bank() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeSampleData();
    }
    
    private void initializeSampleData() {
        Person john = new Person("John Doe", "123 Main St", "555-1234");
        Person jane = new Person("Jane Smith", "456 Oak Ave", "555-5678");
        
        accounts.add(new BankAccount("1001", "1234", john));
        accounts.add(new BankAccount("1002", "5678", jane));
    }
    
    public void start() {
        while (true) {
            System.out.println("\nWelcome to Java Bank");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Thank you for banking with us!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private void login() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        
        for (BankAccount account : accounts) {
            if (account.authenticate(accountNumber, pin)) {
                currentSession = account;
                showAccountMenu();
                return;
            }
        }
        
        System.out.println("Invalid account number or PIN");
    }
    
    private void showAccountMenu() {
        while (currentSession != null) {
            System.out.println("\nAccount Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Print Receipt");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
     if (choice == 1) {
            System.out.print("Enter deposit amount: R");
            double depositAmount = scanner.nextDouble();
            currentSession.deposit(depositAmount);
        } 
        else if (choice == 2) {
            System.out.print("Enter withdrawal amount: R");
            double withdrawAmount = scanner.nextDouble();
            currentSession.withdraw(withdrawAmount);
        } 
        else if (choice == 3) {
            System.out.println("Current Balance: R" + currentSession.getBalance());
        } 
        else if (choice == 4) {
            currentSession.printReceipt();
        } 
        else if (choice == 5) {
            currentSession = null;
            System.out.println("Logged out successfully");
            return;
        } 
        else {
            System.out.println("Invalid choice");
        }
        }
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.start();
    }
}
