package mymockitoproject.Misc;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //Other problems Suggested by Udemy
    //https://leetcode.com/problems/maximum-subarray/description/
    //https://leetcode.com/problems/move-zeroes/description/
    //https://leetcode.com/problems/contains-duplicate/description/
    //https://leetcode.com/problems/rotate-array/description/
    //Longest Word

    public static void main(String[] args) {
        int[] input ={2, 5, 7, 15};
        int target = 9;

        System.out.println(Arrays.toString(findTwoSum(input,target)));
    }

    private static int[] findTwoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }



}
