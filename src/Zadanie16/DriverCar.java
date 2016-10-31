package Zadanie16;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class DriverCar extends Man implements Driver {
    DriverCar (String name){
        super(name);
    }

    public void ableSpeak(){
        System.out.println("I know only Russian");
    }

   public void drive(){
       System.out.println("I can drive a car");
    }

    public void repairCar(){
        System.out.println("I can repair a car myself");
    }

    public void haveDriversLicence(){
        System.out.println("I have a driver's licence");
    }

    public void passInspection(){
        System.out.println("I can pass technical inspection");
    }
}
