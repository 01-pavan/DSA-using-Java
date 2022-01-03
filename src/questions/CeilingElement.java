package questions;

public class CeilingElement {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,11,13,16};
        int target =17;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while ((start<=end)){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            if(start== arr.length){

                return -1;
        }
        }
        return  arr[start];
    }
}
