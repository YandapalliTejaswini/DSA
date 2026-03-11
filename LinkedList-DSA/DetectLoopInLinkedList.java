/*Flood Cycle Detection
Why loops in LikedList-Normally linkedList ends with null but 
sometimes last node is pointed to previous node .So to detect that we use this loop detection.
why it is important beacause traversal becomes infinite.*/



public class DetectLoopInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static boolean  LoopInLinkedList(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
         return false;
    }

    static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head.next;
        if(LoopInLinkedList(head))
            System.out.println("Loop Detected");
        else
            System.out.println("NO loop");
        }
    }
   

