package com.thirdList.higherLowerAverage.utils;

import java.util.Scanner;

public class Scan {

    public static int inputNumber() {
        Scanner number = new Scanner(System.in);
        Printer.inputNumberMessage();
        return number.nextInt();
    }
}
