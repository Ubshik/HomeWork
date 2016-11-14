package Zadanie15_2;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//Multiset - set for some same values
public class GuavaMultiSet {
    String text;

    GuavaMultiSet(String text) {
        this.text = text;
        multiset = HashMultiset.create(Arrays.asList(text.split(" ")));
    }

    Multiset<String> multiset = null;

    public int getNumberOfWordsToUseGuavaMultiSet(){
        if (multiset == null){
            return 0;
        }
        return multiset.size();
    }

    public int getNumberOfDefinedWordGuavaMultiSet(String word){
        if (multiset == null){
            return 0;
        }
        if (multiset.contains(word)) {
            return multiset.count(word);
        }
        return 0;
    }

    public Set<String> getUniqueWordsToUseGuavaMultiSet(){
        if (multiset == null){
            return null;
        }
        return multiset.elementSet();
    }
}
