package com.thirdList.bodyMassIndex.utils;

public class Printer {

    public static String border(String message) {
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

    public static void createPersonInputMessage(){
        System.out.printf("%nCreating a person:%n");
    }

    public static void showPersonResult(int position, String name, String resultBMI){
        System.out.printf("%n%d: %s ---> %s%n",
                position, name, resultBMI);
    }
}
