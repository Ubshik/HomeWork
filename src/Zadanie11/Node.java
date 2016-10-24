package Zadanie11;

import java.util.Random;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class Node {
    Node [] child;
    int fruits;

    Node () {
        child = null;
        Random random = new Random();
        fruits = random.nextInt(15);
    }

    public void initChild(int [] fruits){//number breanches
        child = new Node [fruits.length];
        for (int i=0; i<fruits.length; i++){
            child[i] = new Node();
            child[i].fruits = fruits[i];
        }
    }
}
