package com.company;

import java.util.Arrays;
//when given numbers from range 1 to N use cyclic sort.

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={3,5,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
 static  void Cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){  //remember 3!=2
                swap(arr,i,arr[i]-1);

            }else{
                i++;
            }
        }
 }
 static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
 }
}
