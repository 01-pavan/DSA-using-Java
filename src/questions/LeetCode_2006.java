package questions;

public class LeetCode_2006 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println(countKDifference(nums,k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <i; j++) {

                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }

            }

        }
         return count;
    }
}
