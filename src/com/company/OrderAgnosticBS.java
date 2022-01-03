package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {98,80,76,65,45,3,2,1};
        int[] arr = {-1, 0, 2, 3, 4,45, 56, 78, 90, 91, 98, 342};
        int target = 342;
        try{
        System.out.println(arr[(binarySearch(arr,target)-1)]);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

        static int binarySearch(int[] arr,int target){
            int start=0;
            int end =arr.length-1;
             boolean isAsc = arr[start]<arr[end];

            while(start<=end){
                //find the middle value
//                int mid = (start+end)/2;//might be possible that (start+end) exceeds the int value thats why we used optimised formula to find the mid value
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }

                }else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }else {
                        start = mid + 1;
                    }
                }

            }
            return  -1;
        }
    }

