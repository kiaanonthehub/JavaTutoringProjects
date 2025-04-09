/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseteacher;

/**
 *
 * @author kiaanmaharaj
 */
import java.util.Scanner;

public class IfElseTeacher {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the If-Else Learning Program!");
        System.out.println("This program will help you understand how if-else statements work in Java.");
        
        // Example 1: Simple if-else
        System.out.println("\n--- Example 1: Simple if-else ---");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 10) {
            System.out.println("Your number is greater than 10.");
        } else {
            System.out.println("Your number is 10 or less.");
        }
        
        // Example 2: if-else if-else
        System.out.println("\n--- Example 2: if-else if-else ---");
        System.out.print("Enter your test score (0-100): ");
        int score = scanner.nextInt();
        
        if (score >= 90) {
            System.out.println("Excellent! You got an A.");
        } else if (score >= 80) {
            System.out.println("Good job! You got a B.");
        } else if (score >= 70) {
            System.out.println("Not bad! You got a C.");
        } else if (score >= 60) {
            System.out.println("You got a D. Try harder next time.");
        } else {
            System.out.println("Unfortunately, you got an F. You'll need to retake the test.");
        }
        
        // Example 3: Nested if-else
        System.out.println("\n--- Example 3: Nested if-else ---");
        System.out.print("Is it raining today? (yes/no): ");
        String raining = scanner.next();
        System.out.print("Do you have an umbrella? (yes/no): ");
        String umbrella = scanner.next();
        
        if (raining.equalsIgnoreCase("yes")) {
            if (umbrella.equalsIgnoreCase("yes")) {
                System.out.println("You can go outside with your umbrella!");
            } else {
                System.out.println("You should stay inside or you'll get wet!");
            }
        } else {
            System.out.println("Enjoy the nice weather outside!");
        }
        
        System.out.println("\nThank you for using the If-Else Learning Program!");
        scanner.close();
    }
}
