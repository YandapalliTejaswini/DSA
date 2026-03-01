public class InsertAtBeginning {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node InsertAtBeginning(Node head,int data){
          Node newNode=new Node(data);
          newNode.next=head;
          head=newNode;
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

        // Creating linked list manually
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Traversal call
     System.out.print("Before Insert: ");
        traverse(head);

        // insert new node
        head = InsertAtBeginning(head, 5);

        System.out.print("After Insert: ");
        traverse(head);
    }
}
