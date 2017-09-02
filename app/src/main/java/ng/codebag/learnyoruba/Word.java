package ng.codebag.learnyoruba;

/**
 * Created by Jer on 9/2/2017.
 */

public class Word {
    private String mEnglishWord;

    private String mYorubaTranslation;

    public Word(String englishWord, String yorubaTranslation){
        mEnglishWord = englishWord;
        mYorubaTranslation = yorubaTranslation;

    }

    public String getEnglishWord(){
        return mEnglishWord;
    }

    public String getYorubaTranslation(){
        return mYorubaTranslation;
    }
}