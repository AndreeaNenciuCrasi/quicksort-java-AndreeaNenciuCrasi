package com.codecool.quicksort;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public static void sort(List<Integer> toSort) {
        Integer[] intArray = (Integer[]) toSort.toArray();
        quickSort(intArray, 0, intArray.length);
        toSort = Arrays.asList(intArray);
    }

    public static void quickSort(Integer[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    public static int partition(Integer[] input, int start, int end) {
        //This is using the first element as the pivot
        Integer pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //NOTE: Empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
