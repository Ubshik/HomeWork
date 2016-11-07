package Zadanie18;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Acer5740 on 07.11.2016.
 */
public class MyCollection {
    private ArrayList<String> arrayList = new ArrayList<>();
    private HashSet<String> hashSet = new HashSet<>();

    public void add (String value){
        if (hashSet.contains(value)){
            return;
        }
        else {
            arrayList.add(0,value);
            hashSet.add(value);
        }
    }

    public String getValue (int index){
        return arrayList.get(index);
    }

    public int count (){
        return arrayList.size();
    }

    public static void main(String[] args) {
        String [] array = {"Belarus", "Russia", "USA", "China", "Germany", "Belarus",
                "Great Britain", "Australia", "Russia", "Sweden"};
        MyCollection myCollection = new MyCollection();
        for (String element : array ){
            myCollection.add(element);
        }
        Logger logger = Logger.getLogger(MyCollection.class.getName());
        for (int i = 0; i<myCollection.count(); i++){
            logger.info(myCollection.getValue(i) + " ");
        }
    }
}
