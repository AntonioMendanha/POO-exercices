package com.thirdList.backwards.utils;

public class Printer {

    final static String START_PROGRAM_MESSAGE = "This program was built to read a word provided by the user and return this word backwards.";
    final static String END_PROGRAM_MESSAGE = "Closing program...";
    final static String INPUT_WORD_MESSAGE = "Write a word that you want to see in backwards: ";
    final static String RESULT_WORD_MESSAGE = "See the results now:  ";

    private static String border(String message) {
        String border = "";
        for (int i = 0; i < message.length() ; i++){
            border = border.concat("*");
        }
        return border;
    }

    public static void startProgram(){
        System.out.println(border(START_PROGRAM_MESSAGE));
        System.out.println(START_PROGRAM_MESSAGE);
        System.out.println(border(START_PROGRAM_MESSAGE));
    }

    public static void closeProgram(){
        System.out.println(border(END_PROGRAM_MESSAGE));
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(border(END_PROGRAM_MESSAGE));
    }

    public static void inputWord(){
        System.out.println(INPUT_WORD_MESSAGE);
    }

    public static void results(String oldWord, String newWord) {
        System.out.printf("%s %n -> %s = %s %n%n",
                RESULT_WORD_MESSAGE, oldWord, newWord);
    }
}
