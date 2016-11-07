package Zadanie9_2;

import java.util.Arrays;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class SphereService {
    public static void sortBySize(Sphere[] spheres) {
        System.out.println("Sort by size");
        Arrays.sort(spheres,new SizeComparator());
    }

    public static void sortByColor(Sphere[] spheres){
        System.out.println("Sort by color");
        Arrays.sort(spheres, new SortComparator());
    }

    public static void print(Sphere[] spheres){
        for (int i=0;i<spheres.length;i++){
            System.out.print("["+i+"]"+" "+spheres[i].getColor());
            System.out.println(" ["+i+"]"+" "+spheres[i].getSize());
        }
    }

    public static void main(String[] args) {
        Sphere[]spheres = new Sphere[5];
        for(int i =0; i < spheres.length; i++)
            spheres[i] = new Sphere();


        spheres[0].setColor("green");
        spheres[1].setColor("white");
        spheres[2].setColor("rad");
        spheres[3].setColor("yellow");
        spheres[4].setColor("black");
        spheres[0].setSize(14);
        spheres[1].setSize(8);
        spheres[2].setSize(3);
        spheres[3].setSize(5);
        spheres[4].setSize(9);
        sortByColor(spheres);
        print(spheres);
        System.out.println();
        sortBySize(spheres);
        print(spheres);
    }
}