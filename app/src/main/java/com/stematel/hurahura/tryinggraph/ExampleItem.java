package com.stematel.hurahura.tryinggraph;

public class ExampleItem {
    private int mImageResource1;
    private int mImageResource2;
    private String mText1;
    private String mText2;

    public ExampleItem(int imageResource1, String text1, int imageResource2, String text2){
        mImageResource1 = imageResource1;
        mText1 = text1;
        mImageResource2 = imageResource2;
        mText2 = text2;

    }
    public int getImageResource1(){
        return mImageResource1;
    }
    public String getText1(){
        return mText1;
    }
    public int getImageResource2(){
        return mImageResource2;
    }
    public String getText2(){
        return mText2;
    }
}
