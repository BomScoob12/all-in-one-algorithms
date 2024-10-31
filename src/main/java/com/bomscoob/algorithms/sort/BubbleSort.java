package com.bomscoob.algorithms.sort;

import com.bomscoob.algorithms.interfaces.ISort;

public class BubbleSort implements ISort<Integer> {

    @Override
    public Integer[] sort(Integer[] array) {
        for (int out = 0; out<array.length; out++) {
            for (int in = 0; in<array.length; in++) {
                if (array[in] > array[out]) {
                    int temp = array[in];
                    array[in] = array[out];
                    array[out] = temp;
                }
            }
        }
        return new Integer[0];
    }
}
