package com.thirdList.bodyMassIndex;

import com.thirdList.bodyMassIndex.enums.Messages;
import com.thirdList.bodyMassIndex.service.PersonList;
import com.thirdList.bodyMassIndex.utils.Person;
import com.thirdList.bodyMassIndex.utils.Printer;

public class Main {

    public static void main(String[] args) {


        //Start Program
        Printer.startEndProgram(Messages.START_PROGRAM.getMessage());

        Person[] list = PersonList.createList();
        PersonList.showListResult(list);

        //End Program
        Printer.startEndProgram(Messages.END_PROGRAM.getMessage());
    }
}
