package com.company;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};
        int[] index ={0,1,2,2};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] output =new int[nums.length+2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(index[i]==c){
                output[index[i]]=nums[i];
            }else{
                for(int j=i;j< nums.length ;j++){
                    output[j+1]=output[j];
                    output[j]=nums[i];

                }
            }

            c++;
        }
        return output;
    }
}
