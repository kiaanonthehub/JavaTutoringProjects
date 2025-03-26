/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiaanmaharaj
 */
public class Vehicle {
    
    // properties or characteristics of a vehicles
   
    // protect the variables from being altered - encapsulation 
    private int noOfWheels;
    private String colour ;
    private String engine;
    private String typeOfVehicle;
    private String model;
    private int noOfDoors;
    private boolean isPertrol;
    private boolean isDiesel;
    private int speedOfVehicle;
    
    // getters and setters -  are bascially methods that allow you to access and modify variables with restrictions - you can set the restrictions 

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        if (noOfWheels < 5) // this setter or method is now restricting the user from entering a vehicle with more than 4 wheels
        {     
         this.noOfWheels = noOfWheels;
        }else{
           System.out.println("We dont make vehicles with 5 wheels");
        }
    }
    

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == "Pink"){
            System.out.println("You cannot purchase a vehicle in the colour pink");
        this.colour = colour;
        }else{
            this.colour = colour;
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    } 

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public boolean isIsPertrol() {
        return isPertrol;
    }

    public void setIsPertrol(boolean isPertrol) {
        this.isPertrol = isPertrol;
    }

    public boolean isIsDiesel() {
        return isDiesel;
    }

    public void setIsDiesel(boolean isDiesel) {
        this.isDiesel = isDiesel;
    }

    public int getSpeedOfVehicle() {
        return speedOfVehicle;
    }

    public void setSpeedOfVehicle() {
        this.speedOfVehicle = 20; // 20 kmph
    }
    
    // overloading methods
    public void setSpeedOfVehicle(int speedOfVehicle ) {
       this.speedOfVehicle = speedOfVehicle;
    }
    
}
