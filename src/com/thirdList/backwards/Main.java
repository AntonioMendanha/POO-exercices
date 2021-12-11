package com.thirdList.backwards;

import com.thirdList.backwards.service.BackwardsWord;
import com.thirdList.backwards.utils.Printer;
import com.thirdList.backwards.utils.Scan;

public class Main {

    public static void main(String[] args) {

        //Start program
        Printer.startProgram();

        String word = BackwardsWord.getWord();
        char[] invertedWord = BackwardsWord.wordToCharArray(word);
        String result =  BackwardsWord.invertedWord(invertedWord);
        Printer.results(word, result);

        //Close program
        Printer.closeProgram();
    }
}
