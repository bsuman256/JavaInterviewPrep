package mymockitoproject.Misc;


import java.util.Arrays;
import java.util.Comparator;

public class SortCustomString {
    public static void main(String[] args) {
        String input = "dcbeagfs";
         // Output: abdcegfs
        Character[] charObjectArray = toCharacterArray(input);
        final String pattern = "abdc";
        // Sort, ignoring case during sorting
        Arrays.sort(charObjectArray, new Comparator<Character>(){
            @Override
            public int compare(Character c1, Character c2)
            {
                if(pattern.indexOf(c1)==-1 || pattern.indexOf(c2)==-1){
                    return 0;
                }
                // ignoring case
                if(pattern.indexOf(c1)>pattern.indexOf(c2)){
                    return 1;
                }
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder(charObjectArray.length);
        for (Character c : charObjectArray)
            sb.append(c.charValue());
        System.out.println(sb.toString());

    }

    public static Character[] toCharacterArray( String s ) {

        if ( s == null ) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len ; i++) {
            array[i] = new Character(s.charAt(i));
        }

        return array;
    }

    public static void swap(String[] s,int j,int i){
        String temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
