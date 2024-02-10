package com.hanifusion.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;//head = node & tail = node
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //[10 -> 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            var second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    public void removeLast() {
        //[10 -> 20 -> 30]
        if (isEmpty()) throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    public int size() {
        return size;
    }


    public void print() {
        var current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        var current = head;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }


    public void reverse() {
        if (isEmpty()) return;

        var previous = head;
        var current = head.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

}