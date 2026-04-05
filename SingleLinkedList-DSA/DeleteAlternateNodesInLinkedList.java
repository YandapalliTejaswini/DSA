public class DeleteAlternateNodesInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node DeleteAlternateNodesInLinkedList(Node head){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            curr.next=curr.next.next;

            curr=curr.next;
           
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
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        Node result=DeleteAlternateNodesInLinkedList(head);
        traverse(head);

    }
}
