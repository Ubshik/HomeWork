package Zadanie14_2;

import java.util.Comparator;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class AgeComparators implements Comparator<Sportsman> {
    public int compare (Sportsman a, Sportsman b){
        return b.age - a.age;
    }
}
