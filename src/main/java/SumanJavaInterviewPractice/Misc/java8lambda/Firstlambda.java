package mymockitoproject.Misc.java8lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Firstlambda {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Suman","Bharath",30));
        personList.add(new Person("Swathi","Musunuri",28));
        personList.add(new Person("Abhiram","Bharath",1));

        //1. Sort List

        Collections.sort(personList, (o1, o2) -> o2.getLastName().compareTo(o1.getLastName()));

        //2. Print all Elements
        personList.forEach(System.out::println);

        //3. Print all person whose Lastname Starts with B
        System.out.println("\n ONly People whose lastname startws with 'B' ");
        List<Person> newList =personList.stream().filter((f)->f.getLastName().startsWith("B")).collect(Collectors.toList());
        newList.forEach(System.out::println);


    }
}
