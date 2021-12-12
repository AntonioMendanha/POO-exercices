package com.thirdList.formatedWord.utils;

import com.thirdList.formatedWord.enums.Messages;

public class Printer {

    public static String border(String message){
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

    public static void inputWordMessage() {
        System.out.print(Messages.INPUT_WORD.getMessage());
    }

    public static void resultMessage(char[] word) {
        System.out.print(Messages.RESULT_MESSAGE.getMessage());
        System.out.println(word);
    }
}
