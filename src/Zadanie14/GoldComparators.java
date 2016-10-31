package Zadanie14;

import java.util.Comparator;

/**
 * Created by Acer5740 on 31.10.2016.
 */
public class GoldComparators implements Comparator <Sportsman> {

    public int compare (Sportsman a, Sportsman b){
        if (a.gold == b.gold) return a.name.compareTo(b.name);
        return b.gold - a.gold;
    }
}

