package questions;
//287. Find the Duplicate Number

import java.util.Arrays;

class Leetcode_287 {
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {

        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        for(int index =0;index< nums.length;index++){
            if(index!=nums[index]-1){
                return  nums[index];
            }
        }
        return 0;
    }
    static  void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}