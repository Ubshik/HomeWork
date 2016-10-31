package Zadanie16;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class Employee extends Man implements Worker, Restable {

    Employee (String name){
        super(name);
    }

    public void ableSpeak(){
        System.out.println("I can speak and know 3 languages");
    }

    public void calculate(){
        System.out.println("I can use calculator");
    }

   public void audit(){
        System.out.println("I know law");
    }

    public void checkAccount(){
        System.out.println("I can check all documents");
    }

    public void acceptPayment(){
        System.out.println("I can accept payment");
    }

    public void correctMistake(){
        System.out.println("I know how to correct mistakes in financial documents");
    }

    public void readBook(){
        System.out.println("I like to read detective story in free time");
    }

    public void haveBath(){
        System.out.println("I like to be long time in bath");
    }

    public void sunbathe(){
        System.out.println("I prefer to sunbathe in summer");
    }

    public void walk(){
        System.out.println("It is great to walk in a park!");
    }

    public void goTheatre(){
        System.out.println("It is very interesting be in theatre ");
    }

}
