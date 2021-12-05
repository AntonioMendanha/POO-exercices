package com.secondList.celsiusToFarenheit.service;

import com.secondList.celsiusToFarenheit.utils.Printer;

import java.util.Scanner;

public class Converter {

    public static float temperatureConverter() {
        Scanner inputTemperatureScan = new Scanner(System.in);
        Printer.inputTemperatureMessage();
        float inputTemperature = inputTemperatureScan.nextFloat();

        return (inputTemperature * 1.8f) + 32f;
    }
}
