package Zadanie15_2;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//Multimap - map with some same keys
public class GuavaMultiMap {
    String text;

    GuavaMultiMap(String text) {
        this.text = text;
        words = Arrays.asList(text.split(" "));
        multimap = HashMultimap.create();
        int i = 0;
        for (String word : words){
            multimap.put(word, i);
            i++;
        }
    }

    List<String>words = null;
    Multimap<String, Integer> multimap = null;

    public Multimap<String, Integer> getPositionOfWordsGuavaMultiMap(){
        if (multimap == null){
            return null;
        }
        return multimap;
    }

    public Collection<Integer> getIndex(String word){
        return multimap.get(word);
    }
}
