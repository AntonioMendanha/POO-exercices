package com.secondList.moneyConverter.service;

import com.secondList.moneyConverter.utils.Printer;

import java.util.Scanner;

public class Converter {

    public static float convertDolarToReal() {
        Scanner amountMoneyScan = new Scanner(System.in);
        Printer.inputAmountMoneyMessage();
        return amountMoneyScan.nextFloat();
    }

    public static float exchangeRates() {
        Scanner exchangeRatesScan = new Scanner(System.in);
        Printer.inputExchangeRatesMessage();
        return exchangeRatesScan.nextFloat();
    }

    public static float convertedAmount(float previousAmount, float exchangeRates) {
        return previousAmount * exchangeRates;
    }
}
