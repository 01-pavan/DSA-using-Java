package questions;

import java.util.ArrayList;
import java.util.List;

class LeetCode__448 {
    public static void main(String[] args) {
        int[] nums ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list2=new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                list2.add(j+1);
            }
        }

        return  list2;
    }
    static  void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}