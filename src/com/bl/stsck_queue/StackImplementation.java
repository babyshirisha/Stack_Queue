package com.bl.stsck_queue;

public class StackImplementation implements IStack{
    LinkedList list = new LinkedList();
    public void push(int data) {
        list.add(data);
    }
    public void pop() {
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
        return "StackImplementation{" +
                "list=" + list +
                '}';
    }
}
