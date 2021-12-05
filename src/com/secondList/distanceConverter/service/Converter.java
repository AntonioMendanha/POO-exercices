package com.secondList.distanceConverter.service;

import com.secondList.distanceConverter.utils.Printer;

import java.util.Scanner;

public class Converter {

    final static float INCHES_TO_CENTIMETERS = 2.54f;

    public static float inchesToCentimetersConverter() {
        Scanner inchesScan = new Scanner(System.in);
        Printer.inputInchesMessage();
        return inchesScan.nextFloat() * INCHES_TO_CENTIMETERS;
    }
}
