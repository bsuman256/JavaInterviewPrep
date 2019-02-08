package SumanJavaInterviewPractice.Misc;

public class SuperClass {

    static String s = "";
    static {
        s += "1";
    }
    SuperClass(){
        s += "2";
    }
}



class SubClass extends SuperClass{

    SubClass(){
        s += "3";
    }

    static{
        new SubClass();
        System.out.println(s);
    }

    {s += "4";}
    public static void main(String[] args) {

    }

}