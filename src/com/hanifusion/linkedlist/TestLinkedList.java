package com.hanifusion.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.removeLast();
        linkedList.print();

    }
}
