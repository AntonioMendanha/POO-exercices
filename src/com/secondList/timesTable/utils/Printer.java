package com.secondList.timesTable.utils;

public class Printer {

    final static String START_TIMES_TABLE_MESSAGE = "This program was built to show the Times Table for the number provided by the user";
    final static String END_PROGRAM_MESSAGE = "Closing program...";
    final static String INPUT_NUMBER_MESSAGE = "Choose a number: ";

    public static void startTimesTable() {
        String border = "";
        for (int i = 0; START_TIMES_TABLE_MESSAGE.length() > i; i++ ){
            border = border.concat("*");
        }
        System.out.println(border);
        System.out.println(START_TIMES_TABLE_MESSAGE);
        System.out.println(border);
    }

    public static void endProgram(){

        String border = "";
        for (int i = 0; END_PROGRAM_MESSAGE.length() > i; i++ ){
            border = border.concat("*");
        }
        System.out.println(border);
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(border);
    }


    public static void inputNumberMessage(){
        System.out.print(INPUT_NUMBER_MESSAGE);
    }
}
