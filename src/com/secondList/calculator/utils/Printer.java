package com.secondList.calculator.utils;

public class Printer {

    final static String START_CALCULATOR = "This program was built to do simple calculators!";
    final static String TYPEOF_CALC_MESSAGE = "What Kind of calc do you want to see?";
    final static String END_PROGRAM = "Closing program...";

    public static void startCalculatorPrint() {
        String border = "";
        for (int i = 0; START_CALCULATOR.length() > i; i++ ){
            border = border.concat("*");
        }
        System.out.println(border);
        System.out.println(START_CALCULATOR);
        System.out.println(border);
    }

    public static void typeofCalcMessage() {
        System.out.println(TYPEOF_CALC_MESSAGE);
        System.out.println("Choose the operation:");
        System.out.println("1 -> Sum");
        System.out.println("2 -> Subtract");
        System.out.println("3 -> Divides");
        System.out.println("4 -> Multiply");
    }

    public static void results() {
        System.out.println("********************");
        System.out.print("The answer is: ");
    }

    public static void endCalculatorProgram() {
        String border = "";
        for (int i = 0; END_PROGRAM.length() > i; i++ ){
            border = border.concat("*");
        }
        System.out.println(border);
        System.out.println(END_PROGRAM);
        System.out.println(border);
    }
}
