//This program is for removing only duplicates which are present and keeps all only once which are repeated

public class RemoveDuplicatesFromSortedLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node RemoveDuplicatesFromSortedLinkedList(Node head){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
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
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next=new Node(5);
        Node result=RemoveDuplicatesFromSortedLinkedList(head);
        traverse(result);
    }
}
