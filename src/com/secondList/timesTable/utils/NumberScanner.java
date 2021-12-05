package com.secondList.timesTable.utils;

import java.util.Scanner;

public class NumberScanner {

    public static int numberScan() {
        Scanner inputNumberScan = new Scanner(System.in);
        Printer.inputNumberMessage();
        return inputNumberScan.nextInt();
    }
}
