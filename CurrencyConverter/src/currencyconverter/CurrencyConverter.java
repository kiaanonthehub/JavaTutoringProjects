
package currencyconverter;

import java.util.Scanner;

/**
 *
 * @author kiaanmaharaj
 */
public class CurrencyConverter {


    public static void main(String[] args) {
        
        // Declare our scanner
        Scanner scn = new Scanner(System.in);
        
        // declare and init our variables
        double amount = 0 , convertedEUR = 0 ,convertedGBP = 0 ;
        
        // CONSTANTS - THEY CANNOT CHANGE!!
        // fixed rates declared
        final double EUR = 0.92;
        final double GBP = 0.75;
        
        System.out.print("Enter an amount in USD >>> " ); // we prompt the user
        
        amount = scn.nextDouble(); // we are storing the users amount entered - we use the scanner to get the value
        
        // we need to do a calculation
        convertedEUR = EUR * amount;
        convertedGBP = GBP * amount;
        
        //display the conversion rates to the user
        System.out.println("$"+amount+ " converted to EUR = "+ convertedEUR);
        System.out.println("$"+amount+ " converted to GBP = "+ convertedGBP);
        
        // lets run the app :)
        
        
        
    }
    
}
