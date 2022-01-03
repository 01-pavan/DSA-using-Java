package questions;
//34. Find First and Last Position of Element in Sorted Array
public class Leetcode_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
    }
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] arr=new int[2];
        while (start<=end){
            int mid= start+(end-start)/2;
            if(target==nums[mid]){
                arr[0]=mid;
            }else if(target==nums[start]){

            }
        }
        return arr;
    }

}
