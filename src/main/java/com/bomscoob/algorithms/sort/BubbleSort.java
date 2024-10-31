package com.bomscoob.algorithms.sort;

import com.bomscoob.algorithms.interfaces.ISort;

import java.util.Arrays;

public class BubbleSort <T extends Number> implements ISort<T> {

    @Override
    public T[] sort(T[] array) {
        int len = array.length;
        for (int i = 0; i<len; i++) {
            for (int current = 0; current<len - 1; current++) {
                if (array[current].doubleValue() > array[current + 1].doubleValue()) {
                    T temp = array[current];
                    System.out.printf("Bubble : %.2f \n", temp.doubleValue());
                    array[current] = array[current + 1];
                    array[current + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }
}
