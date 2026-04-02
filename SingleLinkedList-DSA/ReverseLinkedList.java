public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node ReverseLinkedList(Node head){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;

        }
         return prev;
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
        System.out.println("Original list:");
        traverse(head);
        head=ReverseLinkedList(head);
        System.out.println("After reverse");
        traverse(head);

    }
}
