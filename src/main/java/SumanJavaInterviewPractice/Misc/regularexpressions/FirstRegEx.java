package mymockitoproject.Misc.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstRegEx {

    public static void main(String[] args) {
        String str ="abcabcbcbabfbbhfhajdksdjabbdbbdbdbasbac";

        Pattern p = Pattern.compile("ab");
        Pattern p1 = Pattern.compile("[^ab]");
        Matcher m = p1.matcher(str);

        while(m.find()){
            System.out.println("start: " + m.start()+ " end: "+m.end()  + " group: "+ m.group());
            //System.out.println(m.start(1));
            System.out.println(str.substring(m.start(),m.end()));
        }

    }
}
