package Zadanie15_2;

import org.apache.log4j.Logger;

/**
 * Created by Acer5740 on 13.11.2016.
 */
public class Main {
    public static Logger logger = Logger.getLogger(GuavaMultiSet.class);

    public static void main(String[] args) {
        String text = "Different seasons are attractive! Winter is attractive by snow. " +
                "Spring is attractive by new leaves. Summer presents sun to us, autumn - harvest.";
        GuavaMultiMap guavaMultiMap = new GuavaMultiMap(text);
        ApacheMultiMap apacheMultiMap = new ApacheMultiMap(text);
        logger.info("getPositionOfWordsGuavaMultiMap: " + guavaMultiMap.getPositionOfWordsGuavaMultiMap());
        logger.info("getIndexSummer: " + guavaMultiMap.getIndex("Summer"));
        logger.info("getPositionOfWordsApacheMultiMap: " + apacheMultiMap.getPositionOfWordsApacheMultiMap());
        logger.info("getIndexAttractive: " + apacheMultiMap.getIndex("attractive"));
//        GuavaMultiSet guavaMultiSet = new GuavaMultiSet(text);
//        ApacheBags apacheBags = new ApacheBags(text);
//        logger.info("getNumberOfWordsToUseGuavaMultiSet: " + guavaMultiSet.getNumberOfWordsToUseGuavaMultiSet());
//        logger.info("getUniqueWordsToUseGuavaMultiSet: " + guavaMultiSet.getUniqueWordsToUseGuavaMultiSet());
//        logger.info("getNumberOfWordAttractiveGuava: " + guavaMultiSet.getNumberOfDefinedWordGuavaMultiSet("attractive"));
//        logger.info("getNumberOfWordsToUseApacheBags: " + apacheBags.getNumberOfWordsToUseApacheBags());
//        logger.info("getUniqueWordsToUseApacheBags: " + apacheBags.getUniqueWordsToUseApacheBags());
//        logger.info("getNumberOfWordAttractiveApache: " + apacheBags.getNumberOfDefinedWordApacheBags("attractive"));
//        String [] english = {"football", "volleyball", "ski", "hockey", "tennis"};
//        String [] russian = {"футбол", "волейбол", "лыжи","хоккей", "теннис"};
//        GuavaBiMap guavaBiMap = new GuavaBiMap(english,russian);
//        ApacheBidiMap apacheBidiMap = new ApacheBidiMap(english, russian);
//        logger.info("getTranslateGuavaBiMap: " + guavaBiMap.getTranslateGuavaBiMap());
//        logger.info("getTranslateEnglishGuavaBiMapTENNIS: " + guavaBiMap.getTranslateEnglishGuavaBiMap("tennis"));
//        logger.info("getTranslateRussianGuavaBiMapХОККЕЙ: " + guavaBiMap.getTranslateRussianGuavaBiMap("хоккей"));
//        logger.info("getTranslateRussianGuavaBiMapКОНЬКИ: " + guavaBiMap.getTranslateRussianGuavaBiMap("коньки"));
//        logger.info("getTranslateApacheBidiMap: " + apacheBidiMap.getTranslateApacheBidiMap());
//        logger.info("getTranslateEnglishApacheBidiMapTENNIS: " + apacheBidiMap.getTranslateEnglishApacheBidiMap("tennis"));
//        logger.info("getTranslateRussianApacheBidiMapХОККЕЙ: " + apacheBidiMap.getTranslateRussianApacheBidiMap("хоккей"));
//        logger.info("getTranslateRussianApacheBidiMapКОНЬКИ: " + apacheBidiMap.getTranslateRussianApacheBidiMap("коньки"));
    }
}
