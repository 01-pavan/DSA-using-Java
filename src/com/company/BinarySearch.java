package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3, 4, 56, 78, 90, 91, 98, 342};
        int target = 91;
        System.out.println(binarySearch(arr,target));
        System.out.println(arr.length);
    }
        static int binarySearch(int[] arr,int target){
            int start=0;
            int end =arr.length-1;

            while(start<=end){
                //find the middle value
//                int mid = (start+end)/2;//might be possible that (start+end) exceeds the int value thats why we used optimised formula to find the mid value
                int mid=start+(end-start)/2;
                System.out.println(mid);
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else{
                    //ans found
                    return mid;
                }
            }
                return  -1;
        }
    }

