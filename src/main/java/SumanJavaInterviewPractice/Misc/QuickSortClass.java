package mymockitoproject.Misc;

import java.util.Arrays;

public class QuickSortClass {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 9, 10, 4};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
       // partition(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] a,int i,int j){
        int temp =a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 5,7,2,9,10,4
    // ^          ^


    public static int partition(int[]a, int left, int right){
        int pivot = a[right];
        int i=left-1;
        for(int j=left;j<right;j++){
            if(a[j]<=pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,right);

        return i+1;
    }

    public static void quickSort(int[] a,int left,int right){
        if(left<right){
            int pivot = partition(a, left, right);
            quickSort(a, left, pivot-1);
            quickSort(a, pivot + 1, right);
        }

    }




}


