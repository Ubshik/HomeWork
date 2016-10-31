package Zadanie13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Acer5740 on 30.10.2016.
 */
public class TestCollection {
    private static int n = 100_000;
    private static int m = -111_111;

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            arrayList.add(i);
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Time operation ADD in ArrayList is " + result + " miliseconds");

        start = System.currentTimeMillis();
            arrayList.add(557,m);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation ADD 1 VALUE in ArrayList is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            arrayList.get(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation GET in ArrayList is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            arrayList.remove(0);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation REMOVE in ArrayList is " + result + " miliseconds");

        for (int element:arrayList){
            System.out.print("arrayList consists of " + element);
        };
        System.out.println();


        LinkedList <Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            linkedList.add(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation ADD in LinkedList is " + result + " miliseconds");

        start = System.currentTimeMillis();
            linkedList.add(557,m);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation ADD 1 VALUE in LinkedList is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            linkedList.get(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation GET in LinkedList is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            linkedList.remove(0);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation REMOVE in LinkedList is " + result + " miliseconds");

        for (int element:linkedList){
            System.out.print("arrayList consists of " + element);
        };
        System.out.println();


        HashSet <Integer> hashSet = new HashSet<>();
        start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            hashSet.add(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation ADD in HashSet is " + result + " miliseconds");

        start = System.currentTimeMillis();
            hashSet.add(m);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation ADD 1 VALUE in HashSet is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            hashSet.contains(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation CONTAINS in HashSet is " + result + " miliseconds");

        start = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            hashSet.remove(i);
        }
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("Time operation REMOVE in HashSet is " + result + " miliseconds");

        for (int element:hashSet){
            System.out.print("arrayList consists of " + element);
        };
        System.out.println();
    }
}
