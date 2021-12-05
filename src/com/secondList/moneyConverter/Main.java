package com.secondList.moneyConverter;

import com.secondList.moneyConverter.service.Converter;
import com.secondList.moneyConverter.utils.Printer;

public class Main {

    public static void main(String[] args){

        //Start program
        Printer.startMoneyConverterMessage();

        float amountDolar = Converter.convertDolarToReal();
        float todayExchangeRates = Converter.exchangeRates();
        float convertedMoney = Converter.convertedAmount(amountDolar, todayExchangeRates);
        Printer.moneyConvertedResults(convertedMoney);

        //End program
        Printer.endMoneyConverterMessage();
    }
}
