package mymockitoproject.Misc;

public class PerfectNumber {

    public static void main(String[] args) {

        int num =10000;
        int start =1;

        for(int i=start;i<num+1;i++){
            if(isPerfectNumber(i)){
                System.out.println(i);
            }
        }


       // System.out.printf("%d: is a perfectNumber: %s",num,isPerfectNumber(num));

    }

    public static boolean isPerfectNumber(int num){
            int div=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                div+=i;
            }
        }
        if(div == num){
            return true;
        }else{
            return false;
        }
    }
}
