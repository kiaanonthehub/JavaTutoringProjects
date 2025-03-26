/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakeacake;

/**
 *
 * This class will have methods that we can reuse to Bake A Cake
 */
public class BakeACake {

    
    public static void main(String[] args) {
        
       // Calling the methods in the correct order to bake the cake
       
        System.out.println("BAKING THE FIRST CAKE");
        GetIngredients();
        SiftTheFlour();
        MixTheWetIngredients();
        PreHeatTheOven();
        BakeTheCake();
        EatTheDeliciousCat();
        
        System.out.println("Lets bake another cake");
        
        System.out.println("\nBAKING THE SECOND CAKE");
        GetIngredients();
        SiftTheFlour();
        MixTheWetIngredients();
        PreHeatTheOven();
        BakeTheCake();
        EatTheDeliciousCat();
        
    }
    
    /*
        Steps to make a cake 
        1. GetIngredients()
        2. SiftTheFlour()
        3. MixTheWetIngredients()
        4. PreHeatTheOven()
        5. BakeTheCake()
        6. EatTheDeliciousCat()
    */
    
    // Step 1 - We Define / Create the methods 
    
    public static void GetIngredients(){
    System.out.println("Gather the ingredients from your Grandma's cupboard");
    }
    
    public static void SiftTheFlour(){
    System.out.println("Sift the flour");
    }
    
    public static void MixTheWetIngredients(){
    System.out.println("Mix the ingrediants together dont't forget the Brandy");
    }
    
    public static void PreHeatTheOven(){
    System.out.println("Preheat the oven at 175 degrees Celcius.");
    }
    
    public static void BakeTheCake(){
    System.out.println("We gonna bake the cake AND THEN Sit and watch TV @Jashveer");
    }
    
    public static void EatTheDeliciousCat(){
    System.out.println("Yummy in my tummy the cake is consumed");
    }
    
    
  
    
}
