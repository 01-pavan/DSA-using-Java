package com.company;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        for(int i=0;i< arr.length;i++){
            boolean swapped=false;    //it is used to check for already swapped array
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j-1]>arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }

        }


    }
}

