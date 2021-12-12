package com.thirdList.biggerName;

import com.thirdList.biggerName.enums.Messages;
import com.thirdList.biggerName.service.GuessList;
import com.thirdList.biggerName.utils.Printer;
import com.thirdList.biggerName.utils.Scan;

public class Main {

    public static void main(String[] args) {

        //Start Program
        Printer.startEndProgram(Messages.START_PROGRAM.getMessage());

        GuessList.inputGuessList();

        //End Program
        Printer.startEndProgram(Messages.END_PROGRAM.getMessage());
    }
}
