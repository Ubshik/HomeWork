package Zadanie4;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class ChangePlace {


    static public class Numbers{

        private int a;
        private int b;

        Numbers(int a, int b){
            this.a=a;
            this.b=b;
        }

        int getA () {return a;}
        int getB () {return b;}

        void useThirdVariable (){
            int c= a;
            a=b;
            b=c;
        }

        void useXor (){
            a=a^b;
            b=b^a;
            a=a^b;
        }

    }


    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Numbers enter = new Numbers(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        enter.useThirdVariable();
        System.out.println("use changePlace: a=" + enter.getA() + " b=" + enter.getB());
        enter.useXor();
        System.out.println("use useXor: a=" + enter.getA() + " b=" + enter.getB());
    }
}
