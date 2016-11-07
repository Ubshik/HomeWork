package Zadanie11;

import java.util.Random;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class Node {
    private Node [] child;
    private int fruits;

    Node () {
        child = null;
        Random random = new Random();
        fruits = random.nextInt(15);
    }

    public void setFruits(int value){
        fruits = value;
    }

    public int getFruits (){
        return fruits;
    };

    public Node getChild(int index){
        return child[index];
    };

    public int getChildSize(){
        if (child == null) {
            return  0;
        }
        return child.length;
    };

    public void initChild(int [] fruits){//number breanches
        child = new Node [fruits.length];
        for (int i=0; i<fruits.length; i++){
            child[i] = new Node();
            child[i].fruits = fruits[i];
        }
    }
}
