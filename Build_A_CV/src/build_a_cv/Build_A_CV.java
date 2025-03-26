/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package build_a_cv;

import java.util.Scanner;

/**
 *
 * @author kiaanmaharaj
 */
public class Build_A_CV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Declare variables
        String name;
        
        // Declare scanner 
        Scanner scn = new Scanner(System.in);
        
        // Initialise variables
        name = "";
        // or we can use -> name = null;
        
        System.out.print("Please enter your name : ");
        
        // Get the info from the user
        name = scn.nextLine();
        
        
        // Print or display to the user , what value has been stored in the variable name
        System.out.println("Your name is : " + name);
        
         // QUICK TIPS - when working with scanners
        
        /*
        1.  We Declare the scanner 
        Scanner abc = new Scanner(System.in);
        
        2. to use the scanner to get the users info 
        abc.NextLine()
        abc.NextInt()
        abc.nextDouble()
        
        */
        
        
        // ------- WORKING WITH INT -------------
        
        // Declare and init variable age
        String age = "";
        
        // prompt the user
        System.out.print("please enter your age : ");
        
        // save the users age to a variable 
        age = scn.nextLine();
        
        // display to the user what value is stored in age 
        System.out.println("Your age is : "+ age);
        
        // ------------------ WORKING WITH A DOUBLE ----------------------
        
        // declare and init 
        
        double salary = 0.0 , wishIHadThisSalary = 0.0;
        
        // prompt the user 
        System.out.print("hmm ,  how about you tell me how much you earn R "); // accepts the users info on the same line
        salary = scn.nextDouble();
        
        
        System.out.print("This is how we get the users info on the next line ( Please see below ) ");
        System.out.println("hmm ,  how about you tell me how much you earn R "); 
        
        // save the users salary - shh
        wishIHadThisSalary = scn.nextDouble();
        
        // print out the users salary to the world 
        System.out.println("Your salary is R" + salary);
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
