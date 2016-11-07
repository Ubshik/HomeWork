package Zadanie13;

import java.util.*;

/**
 * Created by Acer5740 on 30.10.2016.
 */
public class TestCollection {
    private static int n = 100_000;
    private static int m = -111_111;
    static int index = 50_000;

    public static long addArray (int n, Collection<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.add(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long addValue (int index, int m,List<Integer> collections){
        long start = System.currentTimeMillis();
        collections.add(index, m);
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long addValueHashSet(int m, Set<Integer> collections){
        long start = System.currentTimeMillis();
        collections.add(m);
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long get (int n, List<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.get(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long getHashSet (int n, Set<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.contains(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long remove(int n, List<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.remove(0);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static long removeHashSet(int n, Set<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.remove(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }

    public static void compare (long array, long linked, long hashSet, String type){
        if (array<linked && array<hashSet){
            System.out.println("Command " + type + " faster in ArrayList");
        }
        else if (linked<hashSet){
            System.out.println("Command " + type + " faster in LinkedList");
        }
        else System.out.println("Command " + type + " faster in HashSet");
    }

    public static void print (long array, long linked, long hashSet){
        System.out.println("Time ArrayList is " + array + " miliseconds");
        System.out.println("Time LinkedList is " + linked + " miliseconds");
        System.out.println("Time HashSet is " + hashSet + " miliseconds");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println("Check ADD array");
        long resultAddArrayList = addArray(n,arrayList);
        long resultAddLinkedList = addArray(n,linkedList);
        long resultAddHashSet = addArray(n,hashSet);
        print(resultAddArrayList,resultAddLinkedList,resultAddHashSet);
        compare(resultAddArrayList,resultAddLinkedList,resultAddHashSet,"ADD array");
        System.out.println();

        System.out.println("Check ADD one value in exact index");
        long resultAddValueArrayList = addValue(index,m,arrayList);
        long resultAddValueLinkedList = addValue(index,m,linkedList);
        long resultAddValueHashSet = addValueHashSet(m,hashSet);
        print(resultAddValueArrayList,resultAddValueLinkedList,resultAddValueHashSet);
        compare(resultAddValueArrayList,resultAddValueLinkedList,resultAddValueHashSet,"ADD ONE VALUE");
        System.out.println();

        System.out.println("Check GET array");
        long getArrayList = get(n,arrayList);
        long getLinkedList = get(n,linkedList);
        long getHashSet = getHashSet (n,hashSet);
        print(getArrayList,getLinkedList,getHashSet);
        compare(getArrayList,getLinkedList,getHashSet,"GET array");
        System.out.println();

        System.out.println("Check REMOVE array");
        long removeArrayList = remove(n,arrayList);
        long removeLinkedList = remove(n,linkedList);
        long removeHashSet = removeHashSet(n, hashSet);
        print(removeArrayList,removeLinkedList,removeHashSet);
        compare(removeArrayList,removeLinkedList,removeHashSet,"REMOVE array");
        System.out.println();

        System.out.println("Last element");
        for (int element : arrayList){
            System.out.println("in ArrayList is " + element);
        }
        for (int element : linkedList){
            System.out.println("in LinkedList is " + element);
        }
        for (int element : hashSet){
            System.out.println("in HashSet is " + element);
        }
    }
}
