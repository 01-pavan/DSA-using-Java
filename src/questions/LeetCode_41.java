package questions;

class LeetCode_41 {
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(firstMissingPositive(nums));
    }
    public static  int firstMissingPositive(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0&&correct<=nums.length&&nums[i]!=nums[correct]){  //remember 3!=2
                swap(nums,i,nums[i]-1);

            }else{
                i++;
            }
        }
        int j;
        for ( j=0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return j+1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}