package com.secondList.timesTable;

import com.secondList.timesTable.service.TimesTable;
import com.secondList.timesTable.utils.NumberScanner;
import com.secondList.timesTable.utils.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Starting program
        Printer.startTimesTable();

        int numberScan = NumberScanner.numberScan();
        TimesTable.createTimesTable(numberScan);

        //Closing program
        Printer.endProgram();
    }
}
