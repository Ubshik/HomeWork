package Zadanie16;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class CompanyDriver {

    boolean check (Driver man){
        if (man != null){
            return true;
        }
        return false;
    }
}

//    boolean check (Man man){
//        if (man != null && man instanceof Driver){
//            System.out.println(man.getName() + " is hired");
//            return true;
//        }
//        else System.out.println(man.getName() + " isn't hired because he does not have the appropriate skills");
//        return false;
//    }