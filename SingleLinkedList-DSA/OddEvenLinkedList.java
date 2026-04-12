public class OddEvenLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node OddEvenLinkedList(Node head){
        if(head==null) return null;

        Node odd=head;
        Node even=head.next;
        Node evenHead=even;

        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            
            even.next=odd.next;
            even=even.next;

        }

        odd.next=evenHead;
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
        Node result=OddEvenLinkedList(head);
        traverse(result);
    }
}
