public class ReverseLinkedListInGroups {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseKGroup(Node head, int k){

        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while(curr != null && count < k){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    static void traverse(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args){

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        head = reverseKGroup(head, 2);

        traverse(head);
    }
}