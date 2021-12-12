package com.thirdList.analyzingPeople;

import com.thirdList.analyzingPeople.enums.Messages;
import com.thirdList.analyzingPeople.service.PeopleAnalysis;
import com.thirdList.analyzingPeople.utils.Person;
import com.thirdList.analyzingPeople.utils.Printer;

public class Main {

    public static void main(String[] args) {

        //Start Program
        Printer.startEndProgram(Messages.START_PROGRAM.getMessage());

        PeopleAnalysis.createPeople();

        //End Program
        Printer.startEndProgram(Messages.END_PROGRAM.getMessage());
    }
}
