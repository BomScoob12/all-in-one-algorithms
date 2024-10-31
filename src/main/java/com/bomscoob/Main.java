package com.bomscoob;

import com.bomscoob.algorithms.sort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testBubbleSort();
    }

    private static void testBubbleSort() {
        System.out.println("Bubble sort!!!");
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] arr = new Integer[]{2,5,1,7,5,9};
        String sorted = Arrays.toString(bubbleSort.sort(arr));
        System.out.println(sorted);
    }
}