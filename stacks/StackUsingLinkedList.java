public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    int peek() {
        if (top == null)
            return -1;

        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println(s.pop());

        System.out.println(s.peek());

        s.display();
    }
}