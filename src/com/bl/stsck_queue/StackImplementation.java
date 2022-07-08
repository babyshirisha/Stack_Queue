package com.bl.stsck_queue;

public class StackImplementation implements IStack{
    LinkedList list = new LinkedList();
    public void push(int data) {
        list.add(data);
    }

    @Override
    public String toString() {
        return "StackImplementation{" +
                "list=" + list +
                '}';
    }
}
