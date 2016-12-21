package com.example.administrator.nihongword;

/**
 * Created by WangZeshuang on 2016/12/20.
 */

public class Word {
    private String mJpWord;
    private String mJpCnWord;
    private String mCnWord;

    public Word(String jpWord,String jpCnWord,String cnWord){
        mJpWord = jpWord;
        mJpCnWord = jpCnWord;
        mCnWord = cnWord;
    }
    public Word(String wordString){
        String[] words = wordString.split(" ");
        if (words.length==3){
            setJpWord(words[0]);
            setJpCnWord(words[1]);
            setCnWord(words[2]);
        }else if (words.length==2){
            setJpWord(words[0]);
            setCnWord(words[1]);
        }
    }
    public String getJpWord() {
        return mJpWord;
    }

    public void setJpWord(String jpWord) {
        mJpWord = jpWord;
    }

    public String getJpCnWord() {
        return mJpCnWord;
    }

    public void setJpCnWord(String jpCnWord) {
        mJpCnWord = jpCnWord;
    }

    public String getCnWord() {
        return mCnWord;
    }

    public void setCnWord(String cnWord) {
        mCnWord = cnWord;
    }
}
