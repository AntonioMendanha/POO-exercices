package com.thirdList.backwards.utils;

import java.util.Scanner;

public class Scan {

    public static String wordScan() {
        Scanner word = new Scanner(System.in);
        Printer.inputWord();
        return word.next();
    }
}
