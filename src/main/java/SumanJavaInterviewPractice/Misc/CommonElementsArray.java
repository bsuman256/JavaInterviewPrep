package mymockitoproject.Misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsArray {
    public static void main(String[] args) {
        String[] str1 = {"Java", "June","January"};
        String[] str2 = {"Suman","Swathi","June"};
        String[] str3 = {"Java", "June","January"};

        Set<String> newSet1 = new HashSet<>(Arrays.asList(str1));
        Set<String> newSet2 = new HashSet<>(Arrays.asList(str2));
        Set<String> newSet3 = new HashSet<>(Arrays.asList(str3));

        //newSet1.retainAll(newSet2);

        //System.out.println(newSet1);

        newSet1.retainAll(newSet3);

        if(newSet1.size() == newSet3.size()){
            System.out.println("Equals");
        }else{

            System.out.println("Not equal");
        }



    }
}
