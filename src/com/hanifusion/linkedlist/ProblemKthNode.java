package com.hanifusion.linkedlist;

import java.util.Arrays;

public class ProblemKthNode {
    public static void main(String[] args) {
        //getKthFromTheEnd(k)

        //find the kth node from the end
        //of a linked-list in one pass.(which means: reverse order)

        //[10 -> 20 -> 30 -> 40 -> 50]
        //              *           *
        //k = 1 (50)
        //k = 2 (40)
        //k = 3 (30) (distance = 2)

        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        System.out.println(linkedList.getKthFromTheEnd(2));//20
    }
}
