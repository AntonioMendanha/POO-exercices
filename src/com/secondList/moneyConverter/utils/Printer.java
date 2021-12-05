package com.secondList.moneyConverter.utils;

public class Printer {

    final static String START_MONEY_CONVERTER_MESSAGE = "This program converts a Dolar amount in Real.";
    final static String END_PROGRAM_MESSAGE = "Closing program...";
    final static String INPUT_AMOUNT_MONEY_MESSAGE = "How much Dollar you want to convert? ";
    final static String EXCHANGE_DOLAR_RATES_MESSAGE = "What is the exchange Dolar rates today? ";

    private static String borderMessage(String message){
        String borderMessageLength = "";
        for (int i = 0; i < message.length(); i++) {
            borderMessageLength = borderMessageLength.concat("*");
        }
        return borderMessageLength;
    }

    public static void startMoneyConverterMessage(){
        System.out.println(borderMessage(START_MONEY_CONVERTER_MESSAGE));
        System.out.println(START_MONEY_CONVERTER_MESSAGE);
        System.out.println(borderMessage(START_MONEY_CONVERTER_MESSAGE));
        System.out.printf(" -><-%n -><-%n -=-=-=Use a comma to separate cents-=-=-= %n -><-%n -><-%n");
    }

    public static void endMoneyConverterMessage(){
        System.out.println(borderMessage(END_PROGRAM_MESSAGE));
        System.out.println(END_PROGRAM_MESSAGE);
        System.out.println(borderMessage(END_PROGRAM_MESSAGE));
    }

    public static void moneyConvertedResults(float amount) {
        System.out.printf("This amount was converted in -> R$ %.2f %n",
                amount);
    }

    public static void inputAmountMoneyMessage(){
        System.out.print(INPUT_AMOUNT_MONEY_MESSAGE);
    }
    public static void inputExchangeRatesMessage(){
        System.out.print(EXCHANGE_DOLAR_RATES_MESSAGE);
    }
}
