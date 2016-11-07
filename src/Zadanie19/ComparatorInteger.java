package Zadanie19;

import java.util.Comparator;

/**
 * Created by Acer5740 on 07.11.2016.
 */
public class ComparatorInteger implements Comparator<Integer> {
   @Override
   public int compare (Integer a, Integer b){
        return b-a;
    }
}
