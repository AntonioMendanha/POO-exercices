package com.thirdList.formatedWord.service;

import com.thirdList.formatedWord.utils.Printer;
import com.thirdList.formatedWord.utils.Scan;

public class FormatWord {

    public static String inputWord(){
        return Scan.wordScan();
    }

    public static void formatedWord(String word){
        char[] wordArray = word.toCharArray();
        char[] formatedWord = new char[wordArray.length];
        for(int i = 0; i < wordArray.length ;i++){
          if(i % 2 == 0) {
              formatedWord[i] = Character.toUpperCase(wordArray[i]);
          } else {
              formatedWord[i] = Character.toLowerCase(wordArray[i]);
          }
        }
        Printer.resultMessage(formatedWord);
    }
}
