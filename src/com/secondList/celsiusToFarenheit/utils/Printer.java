package com.secondList.celsiusToFarenheit.utils;

public class Printer {

    final static String START_TEMPERATURE_CONVERTER_MESSAGE = "This program converts a temperature in Celsius to Farenheit";
    final static String END_TEMPERATUTE_CONVERTER_MESSAGE = "Closing program...";
    final static String INPUT_TEMPERATURE_MESSAGE =  "Choose a temperature in Celsius to convert: ";

    private static String borderMessage(String message){
        String borderMessageLength = "";
        for (int i = 0; i < message.length(); i++) {
            borderMessageLength = borderMessageLength.concat("*");
        }
        return borderMessageLength;
    }

    public static void startTemperatureConverterMessage(){
        System.out.println(borderMessage(START_TEMPERATURE_CONVERTER_MESSAGE));
        System.out.println(START_TEMPERATURE_CONVERTER_MESSAGE);
        System.out.println(borderMessage(START_TEMPERATURE_CONVERTER_MESSAGE));
    }

    public static void endTemperatureConverterMessage(){
        System.out.println(borderMessage(END_TEMPERATUTE_CONVERTER_MESSAGE));
        System.out.println(END_TEMPERATUTE_CONVERTER_MESSAGE);
        System.out.println(borderMessage(END_TEMPERATUTE_CONVERTER_MESSAGE));
    }

    public static void temperatureConvertedResults(float temperature) {
        System.out.printf("Temperature converted to Farenheit -> %.2fºF %n",
                temperature);
    }

    public static void inputTemperatureMessage(){
        System.out.print(INPUT_TEMPERATURE_MESSAGE);
    }
}
