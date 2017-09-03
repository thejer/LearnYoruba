package ng.codebag.learnyoruba;

/**
 * Created by Jer on 9/2/2017.
 */

public class Word {
    private String mEnglishWord;

    private String mYorubaTranslation;

    private int mImageId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word(String englishWord, String yorubaTranslation){
        mEnglishWord = englishWord;
        mYorubaTranslation = yorubaTranslation;

    }

    public Word(String englishWord, String yorubaTranslation, int imageId){
        mEnglishWord = englishWord;
        mYorubaTranslation = yorubaTranslation;
        mImageId = imageId;
    }

    public String getEnglishWord(){
        return mEnglishWord;
    }

    public String getYorubaTranslation(){
        return mYorubaTranslation;
    }

    public int getImageId(){
        return mImageId;
    }

    public boolean yesImage(){
        return mImageId != NO_IMAGE;
    }
}

