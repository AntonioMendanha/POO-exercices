package com.secondList.calculator.utils;

import java.util.Scanner;

public class NumberScanner {

    public static int numberScan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number: ");
        return scan.nextInt();
    }

    public static int calcType() {
        Printer.typeofCalcMessage();
        Scanner calcScan = new Scanner(System.in);
        System.out.println("Choose a number: ");
        return calcScan.nextInt();
    }
}
