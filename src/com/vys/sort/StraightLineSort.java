package com.vys.sort;

public class StraightLineSort {

    public static void main(String[] args) {
        int size = args.length;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
