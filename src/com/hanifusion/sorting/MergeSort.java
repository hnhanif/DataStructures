package com.hanifusion.sorting;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] array) {
        if (array.length < 2)
            return;
        //divide into half
        var middle = array.length / 2;

        int left[] = new int[middle];
        for (var i = 0; i < middle; i++)
            left[i] = array[i];

        int right[] = new int[array.length - middle];
        for (var j = middle; j < array.length; j++)
            right[j - middle] = array[j];

        //sort()
        sort(left);
        sort(right);
        //merge
        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }

    public static void main(String[] args) {
        var sorter = new MergeSort();
        int[] numbers = {5, 1, 3, 2, 7, 5, 8, 3};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        System.out.println();
        sorter.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));

    }
}