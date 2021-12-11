package com.thirdList.oddOrEven.utils;

import java.util.Scanner;

public class Scan {

    public static int inputNumber() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print(Printer.INPUT_NUMBER_MESSAGE);
        return inputNumber.nextInt();
    }
}
