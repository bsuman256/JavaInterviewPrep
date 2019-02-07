package mymockitoproject.Misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s = "I am a good programmer";

        System.out.println("Original: "+ s);

        //Reverser a string
        System.out.println("After Reverse: "+ reverseAString(s));


       //Reverse words only
        String[] sPlit = s.split(" ");
        for(int i=0;i<sPlit.length;i++){
            System.out.print(reverseAString(sPlit[i])+ " ");
        }

        //Reverse order of the sentence
        System.out.println("\n "+reverseSentence(s));

        //Reverse middle words of a String
        System.out.println(reverMiddleString(s));


    }

    private static String reverMiddleString(String s) {

        String[] splitArray = s.split(" ");
       // System.out.println(Arrays.toString(splitArray));

        StringBuffer sb = new StringBuffer();
        sb.append(splitArray[0]+" ");
        for(int i=1;i<splitArray.length-1;i++){
            sb.append(reverseAString(splitArray[i])+" ");
        }
        sb.append(splitArray[splitArray.length-1]);
        return sb.toString();
    }


    private static String reverseSentence(String s) {
        String[] splitArray = s.split(" ");
        System.out.println(Arrays.toString(splitArray));

        StringBuffer sb = new StringBuffer();
        for(int i=splitArray.length-1;i>=0;i--){
            sb.append(splitArray[i]+" ");
        }
        return sb.toString();

    }

    public static String reverseAString(String s){
        String[] sArray = s.split("");
        List<String> mylist = Arrays.asList(sArray);
        Collections.reverse(mylist);

        String[] strNames = mylist.toArray(new String[mylist.size()]);

        StringBuilder builder = new StringBuilder();
        for(String sItem : strNames) {
            builder.append(sItem);
        }
        return builder.toString();

    }

}
