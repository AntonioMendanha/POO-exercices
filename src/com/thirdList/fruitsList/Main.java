package com.thirdList.fruitsList;

import com.thirdList.fruitsList.service.Fruits;
import com.thirdList.fruitsList.utils.Printer;

public class Main {

    public static void main(String[] args) {
        //Starting
        Printer.startProgram();

        String[] fruitListArray = Fruits.fruitList();
        Printer.printList(fruitListArray);

        //Closing
        Printer.closeProgram();
    }
}
