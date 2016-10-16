package Zadanie4;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class ChangePlace {

    static public class Chisla{

        int getA () {return a;}
        int getB () {return b;}


        Chisla(int a, int b){
            this.a=a;
            this.b=b;
        }

        void thirdVariable (){
            int c= a;
            a=b;
            b=c;
        }

        void useXor (){
            a=a^b;
            b=b^a;
            a=a^b;
        }

        private int a;
        private int b;
    }


    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Chisla vvod = new Chisla(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        vvod.thirdVariable();
        System.out.println("use changePlace: a=" + vvod.getA() + " b=" + vvod.getB());
        vvod.useXor();
        System.out.println("use useXor: a=" + vvod.getA() + " b=" + vvod.getB());
    }
}
