package com.thirdList.biggerName.utils;

import java.util.Scanner;

public class Scan {

    public static String nameInput() {
        Scanner nameScan = new Scanner(System.in);
        Printer.inputName();
        return nameScan.nextLine();
    }
}
