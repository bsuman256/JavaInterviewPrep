package mymockitoproject.Misc;

public class PermutationString {
    public static void main(String[] args) {

        String s="234";
        char[] arr = s.toCharArray();

        permutation(arr,0,arr.length -1);

    }

    private static void permutation(char[] s, int left, int right) {
        if(left == right){
            System.out.println(s);
        }else{
            for(int i=left;i<=right;i++){
                swap(s,left,i);
                permutation(s,left+1,right);
                swap(s,left,i);
            }
        }
    }
    private static void swap(char[] a,int i, int j){
        char temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
