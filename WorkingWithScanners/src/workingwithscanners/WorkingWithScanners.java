/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingwithscanners;

import java.util.Scanner;

/**
 *
 * @author kiaanmaharaj
 */
public class WorkingWithScanners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter username : ");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("\nUsername is: " + userName);  // Output user input

    }
    
}
