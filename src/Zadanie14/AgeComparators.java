package Zadanie14;

import java.util.Comparator;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class AgeComparators implements Comparator<Sportsman> {
    public int compare (Sportsman a, Sportsman b){
        if (a.age == b.age) return a.name.compareTo(b.name);
        return b.age - a.age;
    }
}
