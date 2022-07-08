package com.bl.stsck_queue;

public class Queue {
    public static void main(String[] args) {
        IQueue<Integer> list = new QueueImplementation();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.dequeue();
        System.out.println(list);
    }
}
