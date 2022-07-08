package com.bl.stsck_queue;

public class QueueImplementation implements IQueue {

    LinkedList list = new LinkedList();

    @Override
    public void enqueue(int data) {
        list.append(data);
    }

    @Override
    public String toString() {
        return "QueueImplementation{" + list +
                '}';
    }
}
