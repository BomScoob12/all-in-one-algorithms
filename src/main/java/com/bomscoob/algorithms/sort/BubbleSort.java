package com.bomscoob.algorithms.sort;

import com.bomscoob.algorithms.interfaces.ISort;

import java.util.Arrays;

public class BubbleSort implements ISort<Integer> {

    @Override
    public Integer[] sort(Integer[] array) {
        for (int out = 0; out<array.length; out++) {
            System.out.println(Arrays.toString(array));
            for (int in = 0; in<array.length; in++) {
                if (array[out] > array[in]) {
                    int temp = array[out];
                    array[out] = array[in];
                    array[in] = temp;
                }
            }
        }
        return array;
    }
}
