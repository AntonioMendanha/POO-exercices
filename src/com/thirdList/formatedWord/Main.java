package com.thirdList.formatedWord;

import com.thirdList.formatedWord.enums.Messages;
import com.thirdList.formatedWord.service.FormatWord;
import com.thirdList.formatedWord.utils.Printer;

public class Main {

    public static void main(String[] args){

        //Start Program
        Printer.startEndProgram(Messages.START_PROGRAM.getMessage());

        String word = FormatWord.inputWord();
        FormatWord.formatedWord(word);

        //End Program
        Printer.startEndProgram(Messages.END_PROGRAM.getMessage());
    }
}
