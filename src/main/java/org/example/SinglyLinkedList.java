package org.example;

public class SinglyLinkedList {

    public ListNode head;

    public SinglyLinkedList(ListNode head){
        this.head=head;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+"-->");
            temp= temp.getNext();
        }
        System.out.println("null");

    }
    public int count(){
        int count =0;
        ListNode temp = head;
        if(head==null){
            return 0;
        }
        while(temp!=null){
            count++;
            temp= temp.getNext();
        }
        return count;
    }

    public void insertAtFirst(ListNode l){
        ListNode temp =head;
        head=l;
         l.setNext(temp);
    }

    public void insertAtLast(ListNode l){
        ListNode l2 = head;
        ListNode prev = l2;
        while(l2!=null){
            prev = l2;
            l2=l2.getNext();
        }
        prev.setNext(l);
    }

    public void createClosedLinkedList(ListNode l){
        ListNode l2 = head;
        ListNode prev = l2;
        while(l2!=null){
            prev = l2;
            l2=l2.getNext();
        }
        prev.setNext(l);
        l.setNext(head);
    }

    public void createClosedLinkedList(){
        ListNode slow = head;
        while(slow.getNext()!=null){
            slow =slow.getNext();
        }
        slow.setNext(head);
    }


    public boolean loopInLinkedList(){
        boolean retVal = false;
        ListNode temp =head;
        ListNode temp2 = head;
        while(temp2.getNext()!=null){
            temp2=temp2.getNext().getNext();
            temp= temp.getNext();
            if(temp2.getNext()==temp){
                return true;
            }
        }
        return retVal;
    }

    public ListNode findMidElement(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.getNext()!=null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();
        }
        return slow;
    }

    public boolean searchElement(int data){
        boolean retVal=false;
        ListNode slow = head;
        while(slow!=null){
            if(slow.getData()==data){
                return true;
            }
            slow= slow.getNext();
        }
        return retVal;
    }

    public boolean delElement(int data){
        boolean retVal=false;
        ListNode slow = head;
        ListNode slow2 = head;
        if(slow.getData()==data){
            head=slow.getNext();
            slow.setNext(null);
            return true;
        }
        while(slow!=null){
            if(slow.getData()==data){
                slow2.setNext(slow.getNext());
                slow.setNext(null);
                return true;
            }
            slow2=slow;
            slow=slow.getNext();
        }
        return retVal;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }
}
