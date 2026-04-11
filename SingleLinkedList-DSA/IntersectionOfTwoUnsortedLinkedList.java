//This program prints output as second list wise(2,8,6) not first list wise(6,2,8)
//If we need first list wise we need to place the values of head2 into set first not head1 values

import java.util.*;
public class IntersectionOfTwoUnsortedLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node IntersectionOfTwoUnsortedLinkedList(Node head1,Node head2){
        HashSet<Integer> set=new HashSet<>();
        while(head1!=null){
            set.add(head1.data);
            head1=head1.next;
        }
        Node dummy=new Node(0);
        Node tail=dummy;
        while(head2!=null){
            if(set.contains(head2.data)){
                tail.next=new Node(head2.data);
                tail=tail.next;
            }
            head2=head2.next;
        }
        return dummy.next;
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
        Node head1=new Node(9);
        head1.next=new Node(6);
        head1.next.next=new Node(4);
        head1.next.next.next=new Node(2);
        head1.next.next.next.next=new Node(3);
        head1.next.next.next.next.next=new Node(8);

        Node head2=new Node(1);
        head2.next=new Node(2);
        head2.next.next=new Node(8);
        head2.next.next.next=new Node(6);
        Node result=IntersectionOfTwoUnsortedLinkedList(head1, head2);
        traverse(result);
    }
}
