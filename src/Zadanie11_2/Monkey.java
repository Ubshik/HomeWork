package Zadanie11_2;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public abstract class Monkey {
    protected String name;
    Monkey(String name){
        this.name = name;
    }

    private int calculateFruits (Node node){
        if (node == null) {return 0;}
        if (node.getChildSize() == 0) {return 0;}
        int fruits = node.getFruits();
        for (int i=0; i<node.getChildSize(); i++){
            fruits+=node.getChild(i).getFruits();
        }
        return fruits;
    }

    public int calculateFruits (Tree tree) {
        if (tree == null) {return 0;}

        if (tree.root == null) {return 0;}
        return calculateFruits(tree.root);
    };
}
