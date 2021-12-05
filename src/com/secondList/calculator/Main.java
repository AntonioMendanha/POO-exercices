package com.secondList.calculator;

import com.secondList.calculator.service.Operations;
import com.secondList.calculator.utils.NumberScanner;
import com.secondList.calculator.utils.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Starting program
        Printer.startCalculatorPrint();

        int firstNumber = NumberScanner.numberScan();
        int secondNumber = NumberScanner.numberScan();
        int operation = NumberScanner.calcType();
        //

        Printer.results();
        System.out.printf("%d",
                Operations.results(operation, firstNumber, secondNumber)
        );
        //Closing program
        Printer.endCalculatorProgram();
    }
}
