package Zadanie1;

import java.util.Scanner;

/**
 * Created by Acer5740 on 15.10.2016.
 */
public class Nok {
    static int getNok (int a, int b){
        int d=Nod.getNod(a,b);
        if (d!=0) return a*b/d;
        return 0;

    }

    public static void main(String[] args) {
        int a,b;
        System.out.println("Введите 2 целых числа a, b");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println(getNok(a,b));
    }
}
