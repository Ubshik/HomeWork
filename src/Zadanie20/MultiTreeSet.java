package Zadanie20;

import org.apache.log4j.Logger;

import java.util.TreeMap;

/**
 * Created by Acer5740 on 09.11.2016.
 */
public class MultiTreeSet {
    private class ObjCount {
        Object object;
        int value;

        ObjCount (Object object, int value){
            this.object = object;
            this.value = value;
        }
    }

    private TreeMap<Integer, ObjCount> treeMap = new TreeMap<>();

    public void add (Object object){
        if (treeMap.containsKey(object.hashCode()) == false){
            treeMap.put(object.hashCode(), new ObjCount(object, 1));
        }
        else {
            treeMap.get(object.hashCode()).value++;
        }
    };

    public boolean contain (Object object){
        return treeMap.containsKey(object.hashCode());
    }

    public int count (Object object){
        ObjCount getHashCode = treeMap.get(object.hashCode());
        if (getHashCode == null){
            return 0;
        }
        else return getHashCode.value;
    }

    public static Logger logger = Logger.getLogger(MultiTreeSet.class);

    public static void main(String[] args) {
        MultiTreeSet multiTreeSet = new MultiTreeSet();
        logger.info("4 contains in TreeMap " + multiTreeSet.count(4) + " times");
        multiTreeSet.add(2);
        multiTreeSet.add(3);
        multiTreeSet.add(7);
        multiTreeSet.add(4);
        multiTreeSet.add(2);
        multiTreeSet.add(7);
        multiTreeSet.add(7);
        logger.info("7 contains in TreeMap " + multiTreeSet.count(7) + " times");
        logger.info("0 in TreeMap is " + multiTreeSet.contain(0));
        logger.info("4 in TreeMap is " + multiTreeSet.contain(4));
    }
}
