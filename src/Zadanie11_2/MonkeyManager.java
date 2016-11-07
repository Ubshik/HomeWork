package Zadanie11_2;

import java.util.Random;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class MonkeyManager {

    public static void main(String[] args) {
        Tree tree1 = new Tree(TypeTree.BANANA,12);//in root 12 fruits
        int [] branch = new int [3];//3 branches
        for (int i =0; i<branch.length; i++){//number fruits not more 10
            Random random = new Random();
            branch[i] = random.nextInt(10);
        }
        Tree tree2 = new Tree(TypeTree.COCONUT,5);
        int [] branch2 = new int [7];//7 branches
        for (int i =0; i<branch2.length; i++){//number fruits not more 10
            Random random = new Random();
            branch2[i] = random.nextInt(10);
        }
        tree1.root.initChild(branch);
        tree2.root.initChild(branch2);
        MonkeyBanana ban = new MonkeyBanana("Ban");
        MonkeyCoconut coco = new MonkeyCoconut("Coco");
        MonkeyTotal tot = new MonkeyTotal("Total");
        System.out.println("MonkeyBanana get " + (ban.calculateFruits(tree1) + ban.calculateFruits(tree2)) + " bananas");
        System.out.println("MonkeyCoconut get " + (coco.calculateFruits(tree1) + coco.calculateFruits(tree2)) + " coconuts");
        System.out.println("MonkeyTotal get " + (tot.calculateFruits(tree1) + tot.calculateFruits(tree2)) + " fruits");
    }

}
