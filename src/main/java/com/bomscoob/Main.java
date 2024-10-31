package com.bomscoob;

import com.bomscoob.algorithms.sort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testBubbleSort();
    }

    private static void testBubbleSort() {
        System.out.println("---Bubble sort---");
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] arr = new Integer[]{2,5,1,7,5,9,3,31,-3};
        String originalArr = Arrays.toString(arr);
        System.out.printf("Original array: %s\n",originalArr);
        String sorted = Arrays.toString(bubbleSort.sort(arr));
        System.out.printf("Final result: %s\n",sorted);
    }
}