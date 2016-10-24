package Zadanie7;

/**
 * Created by Acer5740 on 23.10.2016.
 */
public class Singleton_lasy_ini implements Cloneable {
        private static Singleton_lasy_ini INSTANCE = null;
        public static Singleton_lasy_ini getInstance () {
            if (INSTANCE == null) {INSTANCE = new Singleton_lasy_ini();};
        return INSTANCE;
    }
        private Singleton_lasy_ini (){};
        private Singleton_lasy_ini(Singleton1 s) {
        };

        @Override
        protected Singleton_lasy_ini clone(){
            return INSTANCE;
        }
}


