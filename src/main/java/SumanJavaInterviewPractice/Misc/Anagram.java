package mymockitoproject.Misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {


        reverseANumer();


        String str1 ="break";
        String str2 = "baker";
        Long start = System.nanoTime();
        System.out.println("Using Arrays: " + checkAnagramsUsingArrays(str1,str2));
        System.out.println(System.nanoTime() - start);

        start = System.nanoTime();
        System.out.println("Using Map: "+ checkAnagramsUsingMaps(str1,str2));
        System.out.println(System.nanoTime() - start);



    }

    public static String checkAnagramsUsingArrays(String str1, String str2){

       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       char[] strArr1 = str1.toCharArray();
       char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        return Arrays.equals(strArr1,strArr2)? "Anagrams": " Not Anagrams";


    }


    public static String checkAnagramsUsingMaps(String str1, String str2){
        Map<Character,Integer> m1= returnMap(str1);
        Map<Character,Integer> m2= returnMap(str2);

        Set<Character> keys = m1.keySet();

        for(Character key:keys){
            if(m1.get(key) != m2.get(key)){
                return "Not a Anagram";
            }
        }
        return "Anagram!";

    }

    public static Map<Character,Integer> returnMap(String str){

        Map<Character,Integer> myMap1 = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(myMap1.get(str.charAt(i))!=null){
                myMap1.put(str.charAt(i),myMap1.get(str.charAt(i))+1);
            }else{
                myMap1.put(str.charAt(i),1);
            }
        }

        return myMap1;

    }

    public static void reverseANumer(){
        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
