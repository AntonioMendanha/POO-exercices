package com.thirdList.higherLowerAverage.utils;

import com.thirdList.higherLowerAverage.enums.MessagesEnum;

public class Printer {

    public static String border(String message){
        String border = "";
        for(int i = 0; i < message.length() ; i++) {
            border = border.concat("*");
        }
        return border;
    }
    public static void startProgram(){
        String message = MessagesEnum.START_PROGRAM.getMessage();
        System.out.println(border(message));
        System.out.println(message);
        System.out.println(border(message));
    }
    public static void endProgram(){
        String message = MessagesEnum.END_PROGRAM.getMessage();
        System.out.println(border(message));
        System.out.println(message);
        System.out.println(border(message));
    }

    public static void inputNumberMessage(){
        System.out.print(MessagesEnum.INPUT_NUMBER.getMessage());
    }

    public static void averageMessage(float number){
        System.out.printf("%s %.2f %n",
                MessagesEnum.AVERAGE_MESSAGE.getMessage(), number);
    }
    public static void biggerMessage(int number){
        System.out.printf("%s %d%n",
                MessagesEnum.BIGGER_MESSAGE.getMessage(), number);
    }
    public static void lowerMessage(int number){
        System.out.printf("%s %d %n",
                MessagesEnum.LOWER_MESSAGE.getMessage(), number);
    }
}
