package com.thirdList.backwards.service;

import com.thirdList.backwards.utils.Scan;

public class BackwardsWord {

    public static String getWord() {
        return Scan.wordScan();
    }

    public static char[] wordToCharArray(String word) {
        char[] charArray = word.toCharArray();
        return charArray;
    }

    public static String invertedWord(char[] wordArray) {
        String newWord = "";
        for (int i = wordArray.length - 1; i >= 0; i--) {
            newWord += wordArray[i];
        }
        return newWord;
    }
}
