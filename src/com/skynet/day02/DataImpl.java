package com.skynet.day02;

public class DataImpl {
    private static int getMaxNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,12,1,4545,2,34};
        System.out.println(getMaxNumber(arr));
    }
}
