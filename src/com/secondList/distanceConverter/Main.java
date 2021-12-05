package com.secondList.distanceConverter;

import com.secondList.distanceConverter.service.Converter;
import com.secondList.distanceConverter.utils.Printer;

public class Main {

    public static void main(String[] args) {

        //Start program
        Printer.startDistanceConverterMessage();

        float results = Converter.inchesToCentimetersConverter();
        Printer.distanceConvertedResults(results);

        //End program
        Printer.endDistanceConverterMessage();
    }
}
