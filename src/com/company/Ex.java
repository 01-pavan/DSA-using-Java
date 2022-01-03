package com.company;

import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[3*n];
        for (int i = 0; i < (3 * n); i++) {
            if (i <n) {
                ans[i] = nums[i];
           }else if(i<2*n){
                ans[i]=nums[i-n];
            }else{
                ans[i]=nums[i-2*n];
            }

            }

        return ans;
        }

    }


