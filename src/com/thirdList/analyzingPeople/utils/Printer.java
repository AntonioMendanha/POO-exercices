package com.thirdList.analyzingPeople.utils;

import com.thirdList.analyzingPeople.enums.Messages;

public class Printer {

    private static String border(String message){
        String border = "";
        for(int i = 0; i < message.length() ;i++){
            border = border.concat("*");
        }
        return border;
    }

    public static void startEndProgram(String message){
        System.out.println(border(message));
        System.out.println(message);
        System.out.println(border(message));
    }

    public static void newPersonMessage(){
        System.out.println(Messages.INPUT_NEW_PERSON_MESSAGE.getMessage());
    }
    public static void inputName(){
        System.out.print(Messages.INPUT_NAME_MESSAGE.getMessage());
    }

    public static void inputAge(){
        System.out.print(Messages.INPUT_AGE_MESSAGE.getMessage());
    }

    public static void averageResults(int average) {
        System.out.printf("%s %d.%n",
                Messages.AVERAGE_MESSAGE.getMessage(), average);
    }
    public static void youngerResults(String person) {
        System.out.printf("%s %s.%n",
                Messages.YOUNGER_MESSAGE.getMessage(), person);
    }
    public static void olderResults(String person) {
        System.out.printf("%s %s.%n",
                Messages.OLDER_MESSAGE.getMessage(), person);
    }
}
