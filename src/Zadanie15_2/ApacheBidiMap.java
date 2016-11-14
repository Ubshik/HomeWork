package Zadanie15_2;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

/**
 * Created by Acer5740 on 13.11.2016.
 */

//for double-sided call key and value
public class ApacheBidiMap {
    ApacheBidiMap(String [] english, String [] russian){
        bidiMap = new DualHashBidiMap<>();
        int i=0;
        for (String word : english){
            if(russian.length <= i){
                break;
            }
            else bidiMap.put(word,russian[i]);
            i++;
        }
    }

    BidiMap<String, String> bidiMap = null;

    public BidiMap<String, String> getTranslateApacheBidiMap(){
        if (bidiMap == null){
            return null;
        }
        return bidiMap;
    }

    public String getTranslateEnglishApacheBidiMap(String word){
        if(bidiMap.containsKey(word)){
        return bidiMap.get(word);
        }
        return "not in dictionary";
    }

    public String getTranslateRussianApacheBidiMap(String word){
        if (bidiMap.containsValue(word)){
            return bidiMap.getKey(word);
        }
        return "not in dictionary";
    }
}
