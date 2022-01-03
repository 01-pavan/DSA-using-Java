package com.company;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1},{4,5,6},{45,45},{456}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int sum=0;
        int[] arr= new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            arr[i]=sum;
            sum=0;
        }
        int  max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

         return max;
    }
}
