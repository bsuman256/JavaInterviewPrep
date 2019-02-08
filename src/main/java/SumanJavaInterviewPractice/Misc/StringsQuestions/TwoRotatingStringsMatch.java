package SumanJavaInterviewPractice.Misc.StringsQuestions;

public class TwoRotatingStringsMatch {

    public static void main(String[] args) {
        String mainStr="abcd";
        String second = "cdba";

        System.out.println(" Strings" + (isSubstring(mainStr,second)?" Rotate":" Dont Rotate"));




    }

    public static boolean isSubstring(String s1, String s2){
        String combined = s1+s1;
        return combined.contains(s2);

    }
}
