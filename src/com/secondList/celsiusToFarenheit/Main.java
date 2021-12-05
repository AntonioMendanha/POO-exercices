package com.secondList.celsiusToFarenheit;

import com.secondList.celsiusToFarenheit.service.Converter;
import com.secondList.celsiusToFarenheit.utils.Printer;

public class Main {

    public static void main(String[] args){
        //Start program
        Printer.startTemperatureConverterMessage();

        float convertedTemperature = Converter.temperatureConverter();
        Printer.temperatureConvertedResults(convertedTemperature);

        //End program
        Printer.endTemperatureConverterMessage();
    }
}
