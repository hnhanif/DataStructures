package com.hanifusion.arrays;

import java.util.Arrays;

public class TestExercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise(3);
        exercise.insert(10);
        exercise.insert(20);
        exercise.insert(20);
        exercise.insert(30);
        exercise.insert(40);
        exercise.insert(50);
        System.out.println("max: " + exercise.max());

        System.out.println("\nIntersect\n-----------");
        exercise.intersect(new int[]{10, 20, 50, 1, 20, 3});

        System.out.println("\narray reverse:\n---------");
        System.out.print("Original Array: ");
        exercise.print();
        System.out.println("\nReverse Array: " + Arrays.toString(exercise.reverse()));

        System.out.println("\nInsertAt\n--------");
        System.out.print("Original Array: ");
        exercise.print();
        exercise.insertAt(85, 3);
        System.out.print("\nAfter insert new Array: ");
        exercise.print();

    }
}
