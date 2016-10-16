package Zadanie6;

import java.util.Scanner;

/**
 * Created by Acer5740 on 16.10.2016.
 */
public class Babochka {

    public static void main(String[] args) {
        int n=0;
        System.out.println("Vvod n dlya opredeleniya razmernosti massiva: ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println("Vashe n= " + n);
        int [][] massive = new int[n][n];
        for (int i=0;i<n; i++){
            int min=Integer.min(i,n-i-1);
            int max=Integer.max(i,n-i-1);
            for(int j=0;j<=min;j++){
                massive[i][j]=1;
            }
            for (int j=min+1;j<max;j++){
                massive [i][j]=0;
            }
            for (int j=max;j<n;j++) {
                massive [i][j]=1;
            }
        }
        for (int [] stroka:massive){
            for (int elementPoStroke:stroka)
                System.out.print(elementPoStroke + " ");
            System.out.print("\n");
        }

    }
}