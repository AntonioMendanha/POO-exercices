package com.thirdList.analyzingPeople.utils;

import java.util.Scanner;

public class Scan {

    public static String inputName(){
        Scanner inputNameScan = new Scanner(System.in);
        Printer.inputName();
        return inputNameScan.nextLine();
    }

    public static int inputAge(){
        Scanner inputAgeScan = new Scanner(System.in);
        Printer.inputAge();
        return inputAgeScan.nextInt();
    }
}
