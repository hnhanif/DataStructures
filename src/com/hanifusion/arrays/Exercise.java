package com.hanifusion.arrays;

public class Exercise extends ArrayExercise {
    public Exercise(int length) {
        super(length);
    }

    public int max() {
        int maxInteger = super.items[0];
        for (int i = 0; i < super.count; i++) {
            if (super.items[i] > maxInteger)
                maxInteger = super.items[i];
        }

        return maxInteger;
    }

    public void intersect(int[] another) {
        boolean[] visited = new boolean[another.length];
        int[] commonItems = new int[super.count];
        int index = 0;

        for (int i = 0; i < super.count; i++) {
            for (int j = 0; j < another.length; j++) {
                if (super.items[i] == another[j] && !visited[j]) {
                    commonItems[index++] = another[j];
                    visited[j] = true;
                    break;
                }
            }
        }
        for (int commonItem : commonItems) {
            if (commonItem != 0)
                System.out.print(commonItem + " ");
        }
    }

    public int[] reverse() {
        int[] reverseArray = new int[super.count];
        int index = 0;
        for (int i = super.count - 1; i >= 0; i--)
            reverseArray[index++] = super.items[i];
        return reverseArray;
    }

    public void insertAt(int item, int index) {
        // Check if index is valid
        if (index < 0 || index > count)
            throw new IndexOutOfBoundsException();

        // Check if array is full, resize if necessary
        if (count == items.length) {
            resizeArray();
        }

        // Shift elements to the right to make space for the new item
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        // Insert the new item at the specified index
        items[index] = item;
        count++;
    }

}
