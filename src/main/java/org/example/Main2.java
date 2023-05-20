package org.example;

public class Main2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        SinglyLinkedList s1= new SinglyLinkedList(head);
        s1.insertAtLast(new ListNode(15));
        s1.insertAtLast(new ListNode(25));
        s1.insertAtLast(new ListNode(35));
        s1.insertAtLast(new ListNode(45));

        s1.display();
        System.out.println(s1.findMidElement().getData());
        s1.delElement(10);
        s1.display();
        s1.delElement(25);
        s1.display();
        //s1.createClosedLinkedList(new ListNode(22));
        //s1.createClosedLinkedList();
        s1.display();
        s1.insertAtFirst(new ListNode(2));
        s1.display();



    }
}
