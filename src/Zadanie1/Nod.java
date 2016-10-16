package Zadanie1;

import java.util.Scanner;

/**
 * Created by Acer5740 on 15.10.2016.
 */
public class Nod {

    static int getNod(int a, int b) {
        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return getNod(a%b,b);
        return getNod(a,b%a);
    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("Введите два целых числа a, b");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println(getNod(a,b));

    }

}
