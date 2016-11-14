package Zadanie15_2;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//Multiset - set for some same values
public class ApacheBags {
    String text;

    ApacheBags(String text) {
        this.text = text;
        bag = new HashBag(Arrays.asList(text.split(" ")));
    }

    Bag bag = null;

    public int getNumberOfWordsToUseApacheBags(){
        if(bag == null){
            return 0;
        }
        return bag.size();
    }

    public int getNumberOfDefinedWordApacheBags(String word){
        if (bag == null){
            return 0;
        }
        if(bag.contains(word)) {
            return bag.getCount(word);
        }
        else return 0;
    }

    public Set<String> getUniqueWordsToUseApacheBags(){
        if (bag == null){
            return null;
        }
        return bag.uniqueSet();
    }
}
