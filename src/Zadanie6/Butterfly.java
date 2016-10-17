package Zadanie6;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class Butterfly {

    public static void main(String[] args) {
        int n=0;
        System.out.println("Input n (Integer) for definition size of array: "); // array - массив
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println("Your n = " + n);
        int [][] array = new int[n][n];
        for (int i=0;i<n; i++){
            int min=Integer.min(i,n-i-1);
            int max=Integer.max(i,n-i-1);
            for(int j=0;j<=min;j++){
                array[i][j]=1;
            }
            for (int j=min+1;j<max;j++){
                array [i][j]=0;
            }
            for (int j=max;j<n;j++) {
                array [i][j]=1;
            }
        }
        for (int [] line:array){
            for (int inTheLineItem:line) // элемент по строке:строка
                System.out.print(inTheLineItem + " ");
            System.out.print("\n");
        }

    }
}