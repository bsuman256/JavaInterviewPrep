package mymockitoproject.Misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Better Butter";
        Map<Character,Integer> myMap = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(myMap.get(str.charAt(i))!=null){
                myMap.put(str.charAt(i),(myMap.get(str.charAt(i))+1));
            }else{
                myMap.put(str.charAt(i),1);
            }
        }

        Set<Character> keys = myMap.keySet();

        for(Character key:keys){
            if(myMap.get(key)>1){
                System.out.println(key + " " +myMap.get(key));
            }
        }

    }
}
