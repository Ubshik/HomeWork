package Zadanie5;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class WithoutDevision {

   static int calculate (int a, int b){
        if (b==0){return Integer.MAX_VALUE;}
        if (a<0) {return -calculate(-a,b);}
        if (b<0) {return -calculate(a, -b);}
        if (a<b) {return 0;}
        return calculate(a-b,b)+1;
    }

    public static void main(String[] args) {
        System.out.println("Input two Integers");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("a=" + a + " " + "b=" + b);
        System.out.println(calculate(a,b));

    }

}
