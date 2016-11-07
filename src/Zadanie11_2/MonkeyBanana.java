package Zadanie11_2;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class MonkeyBanana extends Monkey {

    MonkeyBanana(String name) {
        super(name);
    }


    public int calculateFruits(Tree tree) {
        if (tree.name == TypeTree.BANANA) {
            return super.calculateFruits(tree);
        }
        return 0;
    }
}
