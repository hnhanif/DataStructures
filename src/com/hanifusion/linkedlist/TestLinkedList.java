package com.hanifusion.linkedlist;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        int[] array = linkedList.toArray();
        System.out.println("Original Array: " + Arrays.toString(array));

        linkedList.reverse();
        int[] reverseArray = linkedList.toArray();
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray));

        System.out.println(linkedList.getKthFromTheEnd(2));//20
    }
}
