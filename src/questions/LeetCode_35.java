package questions;
//Search Insert Position
public class LeetCode_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));

    }
    public static  int searchInsert(int[] nums, int target) {
        int start=0;
        int ans=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }if(target<nums[mid]){
                end=mid-1;
            }else
                start=mid+1;
        }
        if(end<start){
            return end+1;
        }else
        return start+1;
    }
}
