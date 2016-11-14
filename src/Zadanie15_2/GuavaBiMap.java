package Zadanie15_2;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//for double-sided call key and value
public class GuavaBiMap {
    GuavaBiMap(String [] english, String [] russian){
        biMap = HashBiMap.create(english.length);
        int i=0;
        for (String word : english){
            if(russian.length <= i){
                break;
            }
            else biMap.put(word,russian[i]);
            i++;
        }
    }

    BiMap<String, String> biMap = null;

    public BiMap<String, String> getTranslateGuavaBiMap(){
        if (biMap==null){
            return null;
        }
        return biMap;
    }

    public String getTranslateEnglishGuavaBiMap(String word){
        if(biMap.containsKey(word)){
            return biMap.get(word);
        }
        return "not in dictionary";
    }

    public String getTranslateRussianGuavaBiMap(String word){
        if(biMap.containsValue(word)){
            return biMap.inverse().get(word);
        }
        return "not in dictionary";
    }

}
