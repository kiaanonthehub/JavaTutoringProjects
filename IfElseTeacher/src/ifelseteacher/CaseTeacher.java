/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifelseteacher;

/**
 *
 * @author kiaanmaharaj
 */
import java.util.Scanner;

public class CaseTeacher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Switch-Case Learning Program!");
        System.out.println("This program demonstrates how switch-case statements work in Java.");

        // Example 1: Basic switch-case
        System.out.println("\n--- Example 1: Basic switch-case ---");
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter 1-7.");
        }

        // Example 2: Multiple cases with same outcome
        System.out.println("\n--- Example 2: Multiple cases ---");
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn season");
                break;
            default:
                System.out.println("Invalid month number!");
        }

        // Example 3: Enhanced switch (Java 14+)
        System.out.println("\n--- Example 3: Enhanced switch ---");
        System.out.print("Enter your grade (A, B, C, D, F): ");
        String grade = scanner.next().toUpperCase();

        String message = switch (grade) {
            case "A" ->
                "Excellent!";
            case "B" ->
                "Good job!";
            case "C" ->
                "You passed.";
            case "D" ->
                "You need to improve.";
            case "F" ->
                "You failed.";
            default ->
                "Invalid grade entered!";
        };
        System.out.println(message);

        // Example 4: Switch with enum
        System.out.println("\n--- Example 4: Switch with enum ---");
        System.out.println("Available colors: RED, GREEN, BLUE, YELLOW");
        System.out.print("Enter a color: ");
        String colorInput = scanner.next().toUpperCase();

        try {
            Color color = Color.valueOf(colorInput);
            switch (color) {
                case RED ->
                    System.out.println("Red represents passion and energy.");
                case GREEN ->
                    System.out.println("Green represents nature and growth.");
                case BLUE ->
                    System.out.println("Blue represents calm and stability.");
                case YELLOW ->
                    System.out.println("Yellow represents happiness and optimism.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color entered!");
        }

        System.out.println("\nThank you for using the Switch-Case Learning Program!");
        scanner.close();
    }

    // Enum for Example 4
    enum Color {
        RED, GREEN, BLUE, YELLOW
    }
}
