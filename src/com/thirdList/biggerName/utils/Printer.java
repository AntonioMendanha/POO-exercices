package com.thirdList.biggerName.utils;

import com.thirdList.biggerName.enums.Messages;

public class Printer {

    public static String border(String message){
        String border = "";
        for(int i = 0; i < message.length() ;i++){
            border = border.concat("*");
        }
        return border;
    }

    public static void startEndProgram(String message) {
        System.out.println(border(message));
        System.out.println(message);
        System.out.println(border(message));
    }

    public static void inputName() {
        System.out.print(Messages.INPUT_NAME_MESSAGE.getMessage());
    }

    public static void result(String[] list, int index) {
        System.out.printf("%n%s %s %n",
                Messages.BIGGER_NAME_MESSAGE.getMessage(), list[index]);
    }
}
