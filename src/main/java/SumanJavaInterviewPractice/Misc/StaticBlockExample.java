package mymockitoproject.Misc;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StaticBlockExample {
    int z;
    int a=10;
    static{
        System.out.println("I am in static block"+new StaticBlockExample().z);
    }
    public static void main(String str[]){
        Animal a = new Dog();
        Dog d= (Dog)a;
        boolean b =d instanceof Dog ? true:false;
        System.out.println("testing if do is doodle "+b);
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}