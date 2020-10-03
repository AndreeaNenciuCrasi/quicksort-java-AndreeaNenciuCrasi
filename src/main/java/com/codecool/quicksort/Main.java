package com.codecool.quicksort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(20, 35, -15, 7, 55, 1, -22);

        QuickSort.sort(intArray);

        for (int i = 0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }
    }

}
