package com.hanifusion.sorting;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] arrays) {
        sort(arrays, 0, arrays.length - 1);
    }

    //partition
    private void sort(int[] array, int start, int end) {
        if (start >= end)
            return;

        var boundary = partition(array, start, end);
        //sort left
        sort(array, start, boundary - 1);
        //sort right
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;

        for (var i = start; i <= end; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary);

        return boundary;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        var qc = new QuickSort();
        int[] numbers = {1, 8, 3, 5, 2, 4, 6};
        System.out.println("\nBefore Quick Sort: " + Arrays.toString(numbers));
        qc.sort(numbers);
        System.out.println("\nAfter Quick Sort: " + Arrays.toString(numbers));
    }
}

