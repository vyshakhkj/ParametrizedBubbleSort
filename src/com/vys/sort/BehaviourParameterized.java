package com.vys.sort;

import java.util.function.BiFunction;

public class BehaviourParameterized {

    public static void main(String[] args) {
        int size = args.length;
        Float[] arr = new Float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Float.valueOf(args[i]);
        }
        BiFunction<Float, Float, Boolean> comparator = (o1, o2) -> o1 < o2;
        sortArray(arr, comparator);
    }

    private static <T> void sortArray(T[] arr, BiFunction<T, T, Boolean> comparator) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparator.apply(arr[j - 1], arr[j])) {
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
