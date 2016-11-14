package Zadanie15_2;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//Multimap - map with some same keys
public class ApacheMultiMap {
    String text;

    ApacheMultiMap(String text) {
        this.text = text;
        words = Arrays.asList(text.split(" "));
        multiValuedMap = new HashSetValuedHashMap<>();
        int i = 0;
        for (String word : words){
            multiValuedMap.put(word, i);
            i++;
        }
    }

    List<String> words = null;
    MultiValuedMap<String, Integer> multiValuedMap = null;


    public MultiValuedMap<String, Integer> getPositionOfWordsApacheMultiMap(){
        if (multiValuedMap == null){
            return null;
        }
        return multiValuedMap;
    }

    public Collection<Integer> getIndex(String word){
        return multiValuedMap.get(word);
    }
}
