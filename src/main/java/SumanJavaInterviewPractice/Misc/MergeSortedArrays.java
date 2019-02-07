package mymockitoproject.Misc;


import java.util.*;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] firstArray = {6,3,8,1,9};
        int[] secondArray = {5,2,7};

        int[] resultMergeSorted = mergeSortedArraySolution(firstArray,secondArray);
        System.out.println(Arrays.toString(resultMergeSorted));
    }




    private static int[] mergeSortedArraySolution(int[] firstArray, int[] secondArray) {
      /* Stack<Integer> firstStack = new Stack<>();
       for(int i=0;i<firstArray.length;i++){
           firstStack.push(firstArray[i]);
       }
        Collections.sort(firstStack);
        Stack<Integer> secondStack = new Stack<>();
       for(int i=0;i<secondArray.length;i++){
           secondStack.push(secondArray[i]);
       }
        Collections.sort(secondStack);
        System.out.println("Printing firstStack: "+ firstStack);
        System.out.println("Pringint secondStack: "+ secondStack);
       int[] mergedReulst = new int[firstArray.length+secondArray.length];
       int j=0;
       while(!firstStack.isEmpty() || !secondStack.isEmpty()){
           if(!firstStack.isEmpty() && !secondStack.isEmpty()){
               if(firstStack.peek()>secondStack.peek()){
                   System.out.println("Peeking: "+ firstStack.peek());
                   mergedReulst[j++]=firstStack.pop().intValue();
               }else{
                   System.out.println("Peeking: "+ secondStack.peek());
                   mergedReulst[j++]=secondStack.pop().intValue();
               }

           }else if(!firstStack.isEmpty() && secondStack.isEmpty()){
               mergedReulst[j++]=firstStack.pop().intValue();
           }else if(firstStack.isEmpty() && !secondStack.isEmpty()){
               mergedReulst[j++]=secondStack.pop().intValue();

           }
       }*/


       //return mergedReulst;
        return null;
    }

    public static Integer[] toObject(int[] intArray) {

        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;
    }

    public static int[] toPrimitive(Integer[]IntegerArray) {

        int[] result = new int[IntegerArray.length];
        for (int i = 0; i < IntegerArray.length; i++) {
            result[i] = IntegerArray[i].intValue();
        }
        return result;
    }


}
