
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kiaanmaharaj
 */
public class Main {

    public static void main(String[] args) {
   
        
        //Scanner scn = new Scanner(System.in); - THIS IS JUST A REFERENCE
        
        /*
         If I run a manufacturing company , 
         I dont want to re-write the code for each vehicle 
            
        
         Thats why I created a class called vehicle , that has features (variables)
         and functions e.g. setSpeedOfVehicle to assist me to reuse these 
        */
        Vehicle Car =  new Vehicle(); // -- we know its a car ( but a Urus is a TYPE of car) - Car can be a class 
        Vehicle Plane =  new Vehicle();
        
        
         // lets see what this "Car" can do 
         Car.setEngine("V6");
         System.out.println(Car.getEngine());
         
         Car.setSpeedOfVehicle(); // this here already has a default value of 20 set in the code in the Vehicle class
         Car.setSpeedOfVehicle(45);
         System.out.println(Car.getSpeedOfVehicle());
         
         Car.setColour("Pink");
         System.out.println(Car.getColour());
         
         //Car.setNoOfWheels(5);
         //System.out.println(Car.getNoOfWheels());
        
        
        
    }
    
}
