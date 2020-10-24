package com.company;


public class Problem3 {
    public static int[] sum_array(int[] arr1, int[] arr2){
        int t = 0;
        int s = 0;
        int[] arr3 = new int[arr1.length+1];
        for (int i= arr1.length-1; i>=0; i--) {
            s = arr1[i] + arr2[i] + t;
            arr3[i+1] = s % 10;
            t = s / 10;
        }
        arr3[0] = t;
        return arr3;
    }

    public static int[] diff_array(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length];
        int i = 0;

        if(arr1[i]>arr2[i]){
            for(i=arr1.length-1; i>=0; i--) {
                if (arr1[i] >= arr2[i]) {
                    arr3[i] = arr1[i] - arr2[i];
                } else {
                    arr3[i] = arr1[i] + 10 - arr2[i];
                    arr1[i - 1]--;
                }
            }
        }
        else {
            for (i = arr2.length-1; i>=0; i--) {
                if (arr2[i] >= arr1[i]) {
                    arr3[i] = arr2[i] - arr1[i];
                } else {
                    arr3[i] = arr2[i] + 10 - arr1[i];
                    arr2[i - 1]--;
                }
            }
        }
        return arr3;
    }

    public static int[] multiply_array(int[] arr1, int n) {
        int[] arr3 = new int[arr1.length+1];
        for (int i = arr1.length-1; i>=0; i--) {
            arr3[i+1] = arr1[i] * n;
        }
        for (int i = arr3.length-1; i>0; i--){
            arr3[i-1] = arr3[i-1] + arr3[i] / 10;
            arr3[i] = arr3[i] % 10;
        }
        return arr3;
    }

    public static int[] division_array(int[] arr1, int n){
        int[] arr3 = new int[arr1.length];
        int t = 0;
        for (int i = 0; i<=arr1.length-1; i++) {
            int d = t * 10 + arr1[i];
            arr3[i] = d / n;
            t = d % n;
        }
        return arr3;
    }


}
