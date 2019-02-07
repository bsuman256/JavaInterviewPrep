package mymockitoproject.Misc;

public class Palindrome {

    public static void main(String[] args) {

        String str="Madam";
        str=str.toLowerCase();

        int j=str.length()-1;
        boolean flag = false;
        for(int i=0;i<str.length()/2;i++){
            System.out.println("Comparing: "+ str.charAt(i) + " to "+ str.charAt(j));
            if(str.charAt(i)==str.charAt(j)){
                j--;
                flag =true;
            }else{
                flag = false;
                break;
            }

        }
        System.out.println("Palidrome: "+ (flag?" YES":" NO"));


    }
}
