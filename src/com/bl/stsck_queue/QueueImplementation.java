package com.bl.stsck_queue;

public class QueueImplementation implements IQueue {

    LinkedList list = new LinkedList();

    @Override
    public void enqueue(int data) {
        list.append(data);
    }
    public void dequeue() {
        while(list.size() > 0) {
            peak();
            list.pop();
        }
    }
    void peak(){
        System.out.println(list.top.data);
    }

    @Override
    public String toString() {
        return "QueueImplementation{" + list +
                '}';
    }
}
