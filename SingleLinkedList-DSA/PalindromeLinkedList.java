public class PalindromeLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static boolean PalindromeLinkedList(Node head){
        if(head!=null&&head.next!=null)
            return true;

        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node prev=null;
        while(slow!=null){
            Node next=slow.next;
            slow.next=prev;
            prev=next;
            next=slow;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        System.out.println(PalindromeLinkedList(head));
        
    }
}
