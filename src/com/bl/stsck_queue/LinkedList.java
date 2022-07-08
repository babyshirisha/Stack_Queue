package com.bl.stsck_queue;

public class LinkedList {
    Node top;

    public void add( int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = top;
        top = newNode;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "top=" + top +
                '}';
    }
}
