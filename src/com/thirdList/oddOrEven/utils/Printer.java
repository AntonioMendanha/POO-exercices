package com.thirdList.oddOrEven.utils;

public class Printer {

    final static String START_PROGRAM_MESSAGE= "This program was built to read 5 numbers provided by the user, and returns a list with odd numbers first and even numbers at the end.  ";
    final static String END_PROGRAM_MESSAGE= "Closing program...";
    final static String INPUT_NUMBER_MESSAGE= "Please type a number: ";
    final static String RESULT_MESSAGE= "The answer is:  ";
    final static String ODD_NUMBER_MESSAGE= "Odd numbers: ";
    final static String EVEN_NUMBER_MESSAGE= "Even numbers: ";

    public static String border(String message) {
        String border ="";

        for(int i = 0; i < message.length() ;i++) {
            border = border.concat("*");
        }
        return border;
    }

    public static void startProgram() {
        System.out.println(border(START_PROGRAM_MESSAGE));
        System.out.println(START_PROGRAM_MESSAGE);
        System.out.println(border(START_PROGRAM_MESSAGE));
    }
    public static void endProgram() {
        System.out.println(border(END_PROGRAM_MESSAGE));
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(border(END_PROGRAM_MESSAGE));
    }
    public static void oddNumber() {
        System.out.print(ODD_NUMBER_MESSAGE);
    }
    public static void evenNumber() {
        System.out.print(EVEN_NUMBER_MESSAGE);
    }
}
