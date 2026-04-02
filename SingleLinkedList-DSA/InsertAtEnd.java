public class InsertAtEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

   static  Node InsertAtEnd(int data,Node head){
         Node newNode=new Node(data);
         if(head==null)
           return  newNode;
        Node temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
         temp.next=newNode;
         return head;

    }
    static void traverse(Node head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
     public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before inserting at end:");
           traverse(head);
           head=InsertAtEnd(50,head);
           System.out.println("After inserting:");
           traverse(head);
     }
}
