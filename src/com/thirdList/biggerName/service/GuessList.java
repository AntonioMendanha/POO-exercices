package com.thirdList.biggerName.service;

import com.thirdList.biggerName.utils.Printer;
import com.thirdList.biggerName.utils.Scan;

public class GuessList {

    private final static int LIST_LENGTH = 5;
    public static String[] guessList = new String[LIST_LENGTH];

    private static int nameLength(String name){
        int totalLetters = 0;
        for(int i = 0; i < name.length();i++) {
            totalLetters ++;
        }
        return totalLetters;
    }

    public static void inputGuessList(){
        int biggerWordIndex = 0;
        int biggerNumberOfLetters = 0;

        for (int i = 0; i < LIST_LENGTH ;i++) {
            String actualName = Scan.nameInput();
            int actualLettersName = nameLength(actualName);
            guessList[i] = actualName;
            if (actualLettersName > biggerNumberOfLetters) {
                biggerWordIndex = i;
                biggerNumberOfLetters = actualLettersName;
            }
        }
        Printer.result(guessList, biggerWordIndex);
    }
}
