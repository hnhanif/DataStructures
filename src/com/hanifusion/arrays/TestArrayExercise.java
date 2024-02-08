package com.hanifusion.arrays;

public class TestArrayExercise {
    public static void main(String[] args) {
        ArrayExercise array = new ArrayExercise(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(1);
        System.out.println(array.indexOf(100));//check it contains particular value or not
        array.print();
    }
}
