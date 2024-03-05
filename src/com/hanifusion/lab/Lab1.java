package com.hanifusion.lab;

import java.util.Arrays;

public class Lab1 {
    public int getMax(int[] numbers) {
        var currentMax = numbers[0];

        for (int number : numbers)
            if (number > currentMax)
                currentMax = number;

        return currentMax;
    }


    public void getPartialSum(int[] array) {
        int[] subArray = new int[array.length];
        subArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            subArray[i] = subArray[i - 1] + array[i];
        }

        System.out.println("Partial sum: " + Arrays.toString(subArray));
    }

    public int[] getLargeArray() {
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++)
            largeArray[i] = i;

        return largeArray;
    }


    public static void main(String[] args) {
        var begin1 = System.nanoTime();

        var lab = new Lab1();
//        int[] numbers = {1, 2, 3};

        int maxNumber = lab.getMax(lab.getLargeArray());
        System.out.println("Max number is : " + maxNumber);

        var end1 = System.nanoTime();

        var executionTime1 = (end1 - begin1) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Execution time for getMax: " + executionTime1 + " milliseconds");

        var begin2 = System.nanoTime();
        lab.getPartialSum(lab.getLargeArray());
        var end2 = System.nanoTime();

        var executionTime2 = (end2 - begin2) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("Execution time for getPartialSum: " + executionTime2 + " milliseconds");
    }
}
