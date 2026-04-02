//Linked List-It is a way of storing data and elements are connected from links instead of being stored continuously like array


public class Traversal {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Traversal function
    static void traverse(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;   // move forward
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list manually
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Traversal call
        traverse(head);
    }
}