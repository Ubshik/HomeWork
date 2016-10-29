package Zadanie11_2;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class Tree {
    String name;
    Node root;
    Tree (String name, int i){
        this.name = name;
        root = new Node();
        root.setFruits(i);
    }

}
