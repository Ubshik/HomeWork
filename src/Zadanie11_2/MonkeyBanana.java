package Zadanie11_2;

/**
 * Created by Acer5740 on 24.10.2016.
 */
public class MonkeyBanana extends Monkey {
    MonkeyBanana(String name) {
        super(name);
    }

    @Override
    public int getFruits(Tree tree) {
        if (tree.name == "banana") {
            return super.getFruits(tree);
        }
        return 0;
    }
}
