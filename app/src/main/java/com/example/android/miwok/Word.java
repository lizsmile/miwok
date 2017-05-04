package com.example.android.miwok;

/**
 * Created by lenovo on 2017/5/2.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mRadioId;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation,String miwokTranslation,int radioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mRadioId = radioId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageId,int radioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mRadioId = radioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageId() {
        return mImageId;
    }
    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

    public int getmRadioId() {
        return mRadioId;
    }
}
