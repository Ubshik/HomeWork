package Zadanie19;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Acer5740 on 07.11.2016.
 */
public class BinarySearch {
    private Integer [] array = null;

    public void add (Integer value){
        if (array == null){
            array = new Integer[1];
            array [0] = value;
        }
        else {
            int index = ~Arrays.binarySearch(array,value,new ComparatorInteger());
            Integer [] array2 = new Integer[array.length + 1];
            for (int i = 0; i < index; i++){
                array2 [i] = array [i];
            }
            array2 [index] = value;
            for (int i = index+1; i<array2.length; i++){
                array2 [i] = array [i-1];
            }
            array = array2;
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.add(15);
        binarySearch.add(8);
        binarySearch.add(4);
        binarySearch.add(27);
        binarySearch.add(34);
        binarySearch.add(28);
        binarySearch.add(2);
        binarySearch.add(13);
        binarySearch.add(30);
        binarySearch.add(20);
        binarySearch.add(18);
        binarySearch.add(19);
        Logger logger = Logger.getLogger(BinarySearch.class.getName());
        for (int element : binarySearch.array) {
            logger.info(element + " ");
        }
    }
}
