package Zadanie5;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class BezDeleniyaDelit {

   static int vichisltnie (int a, int b){
        if (b==0) return Integer.MAX_VALUE;
        if (a<0) return -vichisltnie(-a,b);
        if (b<0) return -vichisltnie(a, -b);
        if (a<b) return 0;
        return vichisltnie(a-b,b)+1;
    }

    public static void main(String[] args) {
        System.out.println("Vvod 2 celih chisel");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("a=" + a + " " + "b=" + b);
        System.out.println(vichisltnie(a,b));

    }

}
