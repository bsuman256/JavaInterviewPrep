package mymockitoproject.Misc.Algorithms;

import java.util.Arrays;

public class MergeSortAlgo {

    // Divide & Conquer : divide the array into two halfs'  and sort left array and sort right array and then merge
    // Until two elements left use two finger algorithm
    // Time complexity n(long n) Space O(n) can only done recursively
    public static void main(String[] args) {
        int[] array ={4,7,31,16,20,8,11};
        mergeSort(array,new int[array.length],0,array.length-1);


        System.out.println("Printing Result Arrays: "+ Arrays.toString(array));
    }

    public static void mergeSort(int[] array,int[] temp, int left, int right){
        if(left>=right){
            return;
        }

        int middle = (left+right)/2;
        mergeSort(array,temp,left,middle);
        mergeSort(array,temp,middle+1,right);
        merge(array,temp, left,right);
    }

    public static void merge(int[] array,int[] temp, int leftStart, int rightEnd){

        int leftEnd =(rightEnd+leftStart)/2;
        int rightStart =leftEnd+1;
        int size = rightEnd -leftStart +1;


        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        //Until one of the pointers ends until then copy them into Temp

        while (left<=leftEnd && right<=rightEnd){
            if(array[left] <= array[right]){
                temp[index]=array[left];
                left++;

            }else{
                temp[index]=array[right];
                right++;
            }
            index++;
        }

        //Once above if finished, copy the remaining into temp
        System.arraycopy(array,left,temp,index,leftEnd-left+1);
        System.arraycopy(array,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,array,leftStart,size);




    }



}
