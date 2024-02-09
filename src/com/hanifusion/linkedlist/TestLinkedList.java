package com.hanifusion.linkedlist;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        int[] array = linkedList.toArray();
        System.out.println(Arrays.toString(array));

    }
}
