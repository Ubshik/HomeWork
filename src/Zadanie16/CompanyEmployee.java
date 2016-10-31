package Zadanie16;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class CompanyEmployee {

    private static boolean check (Man man){
        if (man != null && man instanceof Worker){
            System.out.println(man.getName() + " is hired");
            return true;
        }
        else System.out.println(man.getName() + "isn't hired because he does not have the appropriate skills");
        return false;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Lion Loren");
        DriverCar driverCar = new DriverCar("Phil Mandi");
        check(employee);
        check(driverCar);
    }
}
