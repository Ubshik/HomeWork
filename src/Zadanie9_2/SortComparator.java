package Zadanie9_2;

import java.util.Comparator;

/**
 * Created by Acer5740 on 06.11.2016.
 */
class SortComparator implements Comparator <Sphere> {
    @Override
    public int compare (Sphere a, Sphere b){
        return a.getColor().compareTo(b.getColor());
    }
}

