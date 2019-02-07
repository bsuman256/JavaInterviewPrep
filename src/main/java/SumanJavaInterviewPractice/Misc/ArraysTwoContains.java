package mymockitoproject.Misc;

import java.util.Arrays;
import java.util.List;

public class ArraysTwoContains {
    public static void main(String[] args) {

        String[] array1 = {"1","6","4"};
        String[] array2 = {"7","5","1","0"};

        List<String> firstArray = Arrays.asList(array1);
        List<String> secondArray = Arrays.asList(array2);

        boolean firstFlag = false;
        boolean secondFlag = false;
        boolean resultFlag = false;

        if(firstArray.size()>secondArray.size()){
            firstFlag=false;
            secondFlag= true;
        }else{
            secondFlag = false;
            firstFlag = true;
        }

            if(firstFlag){
                resultFlag = matchFound(firstArray,secondArray);
            }else{
                resultFlag = matchFound(secondArray,firstArray);
            }

        System.out.println("Match "+ (resultFlag?"Found":"Not Found"));

    }

    public static boolean matchFound(List<String> array1,List<String> array2){
        boolean resultFlag= false;
        for(int i=0;i<array1.size();i++){
            if(array2.contains(array1.get(i))){
                resultFlag = true;
                break;
            }
        }
        return resultFlag;

    }
}
