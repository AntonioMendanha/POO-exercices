package com.thirdList.bodyMassIndex.service;


import com.thirdList.bodyMassIndex.enums.BodyMassResult;

public class CalculateBodyMass {

    public static float bodyMassIndex(float weight, float height) {
        float bodyMassIndexValue = weight / (height * height);
        return bodyMassIndexValue;
    }

    public static String bodyMassMessage(float bodyMassIndex) {
        String result = "";
        if (bodyMassIndex < 18.5f) {
            result = BodyMassResult.UNDER_WEIGHT.getMessage();
        } else if (bodyMassIndex >= 18.5f && bodyMassIndex < 24.9f) {
            result = BodyMassResult.ON_WEIGHT.getMessage();
        } else if (bodyMassIndex >= 24.9 && bodyMassIndex < 29.9f) {
            result = BodyMassResult.OVER_WEIGHT.getMessage();
        } else if (bodyMassIndex >= 29.9 && bodyMassIndex < 34.9f) {
            result = BodyMassResult.OBESITY_1.getMessage();
        } else if ( bodyMassIndex >= 34.9 && bodyMassIndex < 39.9f) {
            result = BodyMassResult.OBESITY_2.getMessage();
        } else {
            result = BodyMassResult.MORBID_OBESITY.getMessage();
        }
        return result;
    }
}
