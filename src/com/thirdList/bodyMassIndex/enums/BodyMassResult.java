package com.thirdList.bodyMassIndex.enums;

public enum BodyMassResult {
    UNDER_WEIGHT("The Body Mass Index is under 18,5 - under weigth."),
    ON_WEIGHT("The Body Mass Index is between 18,5 and 24,9 - ideal weight"),
    OVER_WEIGHT("The Body Mass Index is between 25,0 and 29,9 - over weight"),
    OBESITY_1("WARNING - The Body Mass Index is between 30,0 and 34,9 - Obesity stage 1"),
    OBESITY_2("DANGER - The Body Mass Index is between 35,0 and 39,9 - Obesity stage 2"),
    MORBID_OBESITY("HEALTH PROBLEMS - The Body Mass Index is over 40 - Morbid Obesity");

    private String message;

    BodyMassResult(String message) { this.message = message; }

    public String getMessage() {
        return message;
    }

}
