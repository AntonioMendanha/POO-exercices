package com.secondList.distanceConverter.utils;

import java.util.Scanner;

public class Printer {

    final static String START_DISTANCE_CONVERTER_MESSAGE = "This program converts Inches to Centimeters.";
    final static String END_PROGRAM_MESSAGE = "Closing program...";
    final static String INPUT_INCHES_MESSAGE = "How much Inches you want to convert in Centimeters? ";

    private static String borderMessage(String message){
        String borderMessageLength = "";
        for (int i = 0; i < message.length(); i++) {
            borderMessageLength = borderMessageLength.concat("*");
        }
        return borderMessageLength;
    }

    public static void startDistanceConverterMessage(){
        System.out.println(borderMessage(START_DISTANCE_CONVERTER_MESSAGE));
        System.out.println(START_DISTANCE_CONVERTER_MESSAGE);
        System.out.println(borderMessage(START_DISTANCE_CONVERTER_MESSAGE));
        System.out.printf(" -><-%n=-=Use a comma to separate decimals =-= %n -><-%n%n");
    }

    public static void endDistanceConverterMessage(){
        System.out.println(borderMessage(END_PROGRAM_MESSAGE));
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(borderMessage(END_PROGRAM_MESSAGE));
    }

    public static void distanceConvertedResults(float inches) {
        System.out.printf("%nThis amount of Inches was converted in -> %.2fcm. %n%n",
                inches);
    }

    public static void inputInchesMessage(){
            System.out.print(INPUT_INCHES_MESSAGE);
        }
}
