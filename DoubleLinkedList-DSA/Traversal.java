public class Traversal {
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
     static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }
    static void traverseForward(Node head){
        Node temp=head;
         System.out.print("Forward: ");
        while(temp!=null){
         System.out.print(temp.data + " ⇄ ");
         temp=temp.next;
        }
        System.out.println("NULL");
    }
     static void traverseBackward(Node head){
        if(head==null)
            return;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }
       public static void main(String[] args) {

        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);

        // Traversals
        traverseForward(head);
        traverseBackward(head);
    
    }
}

