package org.example;

public class ListNode<T> {

    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
