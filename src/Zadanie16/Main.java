package Zadanie16;

/**
 * Created by Acer5740 on 06.11.2016.
 */
public class Main {
    public static void print (boolean success){
        if (success == true){
            System.out.println(" is hired");
        }
        else System.out.println(" isn't hired because he does not have the appropriate skills");
    }

    public static void main(String[] args) {
        CompanyDriver companyDriver = new CompanyDriver();
        CompanyEmployee companyEmployee = new CompanyEmployee();
        Employee employee = new Employee("Lion Loren");
        DriverCar driverCar = new DriverCar("Phil Mandi");
        System.out.println("Decision of CompanyDriver:");
        System.out.print( driverCar.getName());
        print(companyDriver.check(driverCar));
        System.out.println("Decision of CompanyEmployee:");
        System.out.print( employee.getName());
        print(companyEmployee.check(employee));
    }
}
