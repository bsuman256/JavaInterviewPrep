package mymockitoproject.Misc;

import java.util.*;
import java.util.stream.Collectors;


public class FindCommonElements {

    public static void main(String[] args) {

        findMaximumElementinGivenMultiDimensionArray();
    }

    public static void findCommonElementsBetweenTwoArrays(){
        //Given two Arrays find the common Element
        int[] array1 ={20,30,32,100,199,201,500};

        int[] array2 ={600,500,30, 201, 299, 900, 901};


        //Java 8 solution
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        list1.retainAll(list2);
        System.out.println(list1);

    }

    public static void findMaximumElementinGivenMultiDimensionArray(){
        int[][] multi={
                {1,2,3,16},
                {4,6,1,3},
                {9,10,23,45},
                {34,12,7,9}
        };

        for(int i=0;i<multi.length;i++){
            System.out.println("Printing: "+Arrays.toString(multi[i]));

            System.out.println("Using Collections max: " +Collections.max(Arrays.stream(multi[i]).boxed().collect(Collectors.toList())));

           // Arrays.sort(multi[i]);
           // System.out.println("Max: "+ multi[i][multi[i].length-1]);
            Integer maxNumber = Arrays.stream(multi[i]).max().getAsInt();
            System.out.println("Using Stream.max().getAsInt ====>"+maxNumber);

            System.out.println("===== For Better Performance ========");
            IntSummaryStatistics stat = Arrays.stream(multi[i]).summaryStatistics();
            int min = stat.getMin();
            int max = stat.getMax();
            System.out.println("Min = " + min + " Max = " + max);

        }
    }

}