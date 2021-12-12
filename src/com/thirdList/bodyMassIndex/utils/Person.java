package com.thirdList.bodyMassIndex.utils;

public class Person {

    public String name;
    public float weight;
    public float height;
    public float bodyMassIndex;
    public String result;

    public Person(String name, float weight, float height, float bodyMassIndex, String result){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bodyMassIndex = bodyMassIndex;
        this.result = result;
    }
}
