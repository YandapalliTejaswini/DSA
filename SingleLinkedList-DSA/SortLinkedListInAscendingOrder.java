import java.util.*;
public class SortLinkedListInAscendingOrder {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node SortLinkedListInAscendingOrder(Node head){
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
           list.add(temp.data);
           temp=temp.next;
        }
        Collections.sort(list);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.data=list.get(i++);
            temp=temp.next;
        }
        return head;
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
        Node head=new Node(4);
        head.next=new Node(2);
        head.next.next=new Node(1);
        head.next.next.next=new Node(3);
        Node result=SortLinkedListInAscendingOrder(head);
        traverse(head);
    }
}
