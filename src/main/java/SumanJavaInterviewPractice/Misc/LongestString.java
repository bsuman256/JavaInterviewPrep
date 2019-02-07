package mymockitoproject.Misc;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        String input = "letter after letter!!"; //letter
        String output = longestString(input);
        System.out.println("Given input: "+ input);

        System.out.println("Longest String: "+ output);
    }

    private static String longestString(String sen) {
        int maxLen=0;
        String[] arr = sen.toLowerCase().split("[^A-Za-z0-9]");
        System.out.println("Input Array: "+ Arrays.toString(arr));

        maxLen=arr[0].length();
        String longString=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i].length()>maxLen){
                maxLen=arr[i].length();
                longString = arr[i];
            }
        }

        return  longString;

    }


}
