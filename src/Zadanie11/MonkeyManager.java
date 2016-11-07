package Zadanie11;

import java.util.Random;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class MonkeyManager {
    private int getFruits (Node node){
        if (node == null) {return 0;}
        if (node.getChildSize() == 0) {return 0;}
        int fruits = node.getFruits();
        for (int i=0; i<node.getChildSize(); i++){
            fruits+=node.getChild(i).getFruits();
        }
        return fruits;
    }

    public int getFruits (Tree tree) {
        if (tree == null) {return 0;}
        if (tree.root == null) {return 0;}
        return getFruits(tree.root);
    };

    public static void main(String[] args) {
        Tree tree1 = new Tree(12);//in root 12 fruits
        int [] branch = new int [3];//3 branches
        for (int i =0; i<branch.length; i++){//number fruits not more 10
            Random random = new Random();
            branch[i] = random.nextInt(10);
        }
        Tree tree2 = new Tree(5);
        int [] branch2 = new int [7];//3 branches
        for (int i =0; i<branch2.length; i++){//number fruits not more 10
            Random random = new Random();
            branch2[i] = random.nextInt(10);
        }
        tree1.root.initChild(branch);
        tree2.root.initChild(branch2);
        MonkeyManager monkey = new MonkeyManager();
        System.out.println(monkey.getFruits(tree1) + monkey.getFruits(tree2));
    }

}
