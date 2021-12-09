package com.thirdList.fruitsList.service;

import com.thirdList.fruitsList.utils.Printer;

import java.util.Scanner;

public class Scan {

    public static String scanFruit(){
        Scanner fruit = new Scanner(System.in);
        Printer.inputFruit();
        return fruit.next();
    }
}
