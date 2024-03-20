package com.hanifusion.lab;

import java.util.Arrays;

public class Lab2 {
    public static void mergeSort(int[] array) {
        sortMerge(array, 0, array.length - 1);
    }

    private static void sortMerge(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sortMerge(array, start, middle);
            sortMerge(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        int[] leftArray = new int[middle - start + 1];
        int[] rightArray = new int[end - middle];

        System.arraycopy(array, start, leftArray, 0, leftArray.length);
        System.arraycopy(array, middle + 1, rightArray, 0, rightArray.length);

        int i = 0, j = 0, k = start;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }


//    public static void quickSort(int[] array) {
//        sortQuick(array, 0, array.length - 1);
//    }


    private static void sortQuick(int[] array, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            sortQuick(array, start, partitionIndex - 1);
            sortQuick(array, partitionIndex + 1, end);
        }
    }

    // Partitions the array for Quick Sort
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        var start1 = System.nanoTime();
        int[] numbers1 = {1, 10, 3, 7, 2, 8, 4, 6, 9, 5};
        System.out.println("Before Merge Sort: " + Arrays.toString(numbers1));
        mergeSort(numbers1);
        System.out.println("After Merge Sort: " + Arrays.toString(numbers1));
        var end1 = System.nanoTime();

        var mergeSortTakes = (end1 - start1);
        System.out.println("Merge Sort takes: " + mergeSortTakes + " nanoseconds");


        var start2 = System.nanoTime();
        int[] numbers2 = {1, 10, 3, 7, 2, 8, 4, 6, 9, 5};
        System.out.println("Before Merge Sort: " + Arrays.toString(numbers2));
        mergeSort(numbers2);
        System.out.println("After Merge Sort: " + Arrays.toString(numbers2));
        var end2 = System.nanoTime();

        var quickSortTakes = (end2 - start2);
        System.out.println("Quick Sort takes: " + quickSortTakes + " nanoseconds");

        System.out.println("\nWhich is Faster? ");
        if (mergeSortTakes < quickSortTakes)
            System.out.println("Merge sort is Faster");
        else
            System.out.println("Quick Sort is Faster, Because it can run program almost: " + (mergeSortTakes - quickSortTakes) + " nanoseconds earlier");

    }
}
