package Zadanie11_2;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class Monkey {
    String name;
    Monkey(String name){
        this.name = name;
    }

    private int getFruits (Node node){
        if (node == null) {return 0;}
        if (node.child == null) {return 0;}
        int fruits = node.fruits;
        for (int i=0; i<node.child.length; i++){
            fruits+=node.child[i].fruits;
        }
        return fruits;
    }

    public int getFruits (Tree tree) {
        if (tree == null) {return 0;}

        if (tree.root == null) {return 0;}
        return getFruits(tree.root);
    };
}
