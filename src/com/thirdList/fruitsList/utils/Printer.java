package com.thirdList.fruitsList.utils;

public class Printer {

    final static String START_FRUITS_LIST_MESSAGE = "This program was built to read 5 fruits provided by the user and show them in a list at the end";
    final static String END_PROGRAM_MESSAGE = "Closing program...";
    final static String INPUT_FRUIT_MESSAGE = "Input a fruit here: ";

    public static String border(String message) {
        String border = "";
        for (int i = 0; message.length() > i; i++) {
            border = border.concat("*");
        }
        return border;
    }

    public static void startProgram() {
        System.out.println(border(START_FRUITS_LIST_MESSAGE));
        System.out.println(START_FRUITS_LIST_MESSAGE);
        System.out.println(border(START_FRUITS_LIST_MESSAGE));
    }
    public static void closeProgram() {
        System.out.println(border(END_PROGRAM_MESSAGE));
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(border(END_PROGRAM_MESSAGE));
    }

    public static void inputFruit(){
        System.out.print(INPUT_FRUIT_MESSAGE);
    }
    public static void printList(String[] list) {
        System.out.println("Here it is your fruits list.");
        for(int i = 0; i < list.length ;i++) {
            System.out.printf("[ %d ] - %s. %n", i + 1, list[i]);
        }
    }
}
