package com.hanifusion.arrays;

public class ArrayExercise {
    private int[] items;
    private int count;

    public ArrayExercise(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if the array is full, resize it.
        if (items.length == count) {
            // create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set "items" to the new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        //validate the index
        if (index < 0 || index >= count) throw new IllegalArgumentException();
        //shift the items to the left to fill the hole
        //[10, 20, 30, 40]
        //index:1
        //[10,   , 30, 40]
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count - 1; i++) {//count-1 because we're looking for items[i+1] if we set i<count then it will encounter array index out of bounds due to [i+1 is  not available during that time.
            items[i] = items[i + 1];
        }
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
