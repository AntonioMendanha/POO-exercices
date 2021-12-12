package com.thirdList.analyzingPeople.service;

import com.thirdList.analyzingPeople.utils.Person;
import com.thirdList.analyzingPeople.utils.Printer;
import com.thirdList.analyzingPeople.utils.Scan;

public class PeopleAnalysis {

    private final static int TOTAL_PEOPLE = 5;

    //salvar nome e idade
    //criar total idade
    // if maior idade
    // if menor idade
    // average
    public static void teste(){
        Person first = new Person("Antonio", 40);
        System.out.printf("%s -> %d %n", first.name, first.age);
    }
    private static Person createPerson(){
        Printer.newPersonMessage();
        String name = Scan.inputName();
        int age = Scan.inputAge();
        Person person = new Person(name, age);
        return person;
    }

    private static int totalAge(int actualTotal, int newTotal){
        return actualTotal + newTotal;
    }
    private static void averageAge(int average) {
        Printer.averageResults(average);
    }

    private static int youngerPerson(int oldAge, int newAge) {
        int youngerAge = oldAge;
        if(oldAge > newAge) {
            youngerAge = newAge;
        }
        return youngerAge;
    }
    private static int olderPerson(int oldAge, int newAge) {
        int olderAge = oldAge;
        if(oldAge < newAge) {
            olderAge = newAge;
        }
        return olderAge;
    }

     public static Person[] createPeople(){
        Person[] people = new Person[TOTAL_PEOPLE];
        int totalAge = 0;
        int youngerAge = 0;
        String youngerPerson = "";
        int olderAge = 0;
        String olderPerson = "";
        for(int i = 0;  i < TOTAL_PEOPLE ;i++) {
            people[i] = createPerson();
            totalAge = totalAge(totalAge, people[i].age);

            //Check younger person
            int minimumAge = youngerPerson(youngerAge, people[i].age);
            if (youngerAge == 0) {
                youngerPerson = people[i].name;
                youngerAge = people[i].age;
            } else if(minimumAge < youngerAge){
                youngerPerson = people[i].name;
            }

            //Check older person
            int maximumAge = olderPerson(olderAge, people[i].age);
            if (maximumAge > olderAge) {
                olderPerson = people[i].name;
                olderAge = people[i].age;
            }
        }
         //Show older Person
         Printer.olderResults(olderPerson);

        //Show younger Person
        Printer.youngerResults(youngerPerson);

        //Get and show average age
        int average = totalAge / TOTAL_PEOPLE;
        averageAge(average);

        return people;
     }


}


