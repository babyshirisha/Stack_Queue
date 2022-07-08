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
    public int pop() {
        Node temp = top;
        top = temp.next;
        return (int) temp.data;
    }

    public int size() {
        Node temp=top;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
       // System.out.println(count);
        return count;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        Node temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "top=" + top +
                '}';
    }
}
