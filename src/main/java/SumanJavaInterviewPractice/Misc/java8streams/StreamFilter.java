package mymockitoproject.Misc.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {



    public static void main(String[] args) {

        newClass1.m3();

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<10;i++){
           Double value = Math.random() * 10 * i;
           // Integer in = value.intValue();
           list.add(value.intValue());
        }

        list.forEach(System.out::println);

        //To get the 'COUNT"
        System.out.println("Count: "+ list.stream().filter(i->i>15).count());

        //To get new 'List'
        System.out.println("NewList "+ list.stream().filter(m->m>50).collect(Collectors.toList()));



    }
}

interface newClass1{

    static void m3(){
        System.out.println("in m3");
    }

}
