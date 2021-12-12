package com.thirdList.formatedWord.utils;

import java.util.Scanner;

public class Scan {

    public static String wordScan() {
        Scanner inputWordScan = new Scanner(System.in);
        Printer.inputWordMessage();
        return inputWordScan.nextLine();
    }
}
