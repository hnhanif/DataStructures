package com.hanifusion.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.contains(10));
        System.out.println("list size: " + list.size());
        System.out.println("index of: " + list.indexOf(10));
        System.out.println(list);
        var array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
}
