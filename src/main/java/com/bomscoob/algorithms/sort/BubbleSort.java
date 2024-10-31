package com.bomscoob.algorithms.sort;

import com.bomscoob.algorithms.interfaces.ISort;

import java.util.Arrays;

public class BubbleSort implements ISort<Integer> {

    @Override
    public Integer[] sort(Integer[] array) {
        int len = array.length;
        for (int i = 0; i<len; i++) {
            for (int current = 0; current<len - 1; current++) {
                if (array[current] > array[current + 1]) {
                    int temp = array[current];
                    System.out.println("Bubble : " + temp);

                    array[current] = array[current + 1];
                    array[current + 1] = temp;

                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }
}
