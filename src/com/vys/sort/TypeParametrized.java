package com.vys.sort;

public class TypeParametrized {

    public static void main(String[] args) {
        int size = args.length;
        Float[] arr = new Float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Float.valueOf(args[i]);
        }
        sortArray(arr);
    }

    private static <T extends Comparable<T>> void sortArray(T[] arr) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
