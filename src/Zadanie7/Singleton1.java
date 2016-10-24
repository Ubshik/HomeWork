package Zadanie7;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class Singleton1 implements Cloneable {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1 (){};
    private Singleton1(Singleton1 s) {
    };

    @Override
    protected Singleton1 clone(){
        return INSTANCE;
    }
}
