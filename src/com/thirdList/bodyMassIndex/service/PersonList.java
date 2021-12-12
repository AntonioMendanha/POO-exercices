package com.thirdList.bodyMassIndex.service;

import com.thirdList.bodyMassIndex.enums.Messages;
import com.thirdList.bodyMassIndex.utils.Person;
import com.thirdList.bodyMassIndex.utils.Printer;
import com.thirdList.bodyMassIndex.utils.Scan;

public class PersonList {

    private final static int TOTAL_LIST = 5;

    private static Person createPerson(){
        String personName = Scan.personName();
        float personWeight = Scan.weight();
        float personHeight = Scan.height();
        float personBMC = CalculateBodyMass.bodyMassIndex(personWeight, personHeight);
        String result = CalculateBodyMass.bodyMassMessage(personBMC);

        //create a person
        Person person = new Person(personName, personWeight, personHeight,personBMC, result);
        return person;
    }
    public static Person[] createList() {
        Person[] list = new Person[TOTAL_LIST];

        for(int i = 0; i < TOTAL_LIST ;i++) {
            Printer.createPersonInputMessage();
            list[i] = createPerson();
        }
        return list;
    }

    public static void showListResult(Person[] list){
        System.out.printf("%n %s %n",Messages.RESULTS_MESSAGE.getMessage());
        for(int i = 0; i < list.length ;i++){
            Printer.showPersonResult(
                    (i + 1),
                    list[i].name,
                    list[i].result);
        }
    }
}
