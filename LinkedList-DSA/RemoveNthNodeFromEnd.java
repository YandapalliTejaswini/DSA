public class RemoveNthNodeFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node RemoveNthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
        if(fast==null)
            return head;
          fast=fast.next;
        }

        if(fast==null)
            return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    static void  traverse (Node head){
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
        head.next.next.next.next=new Node(50);

        head=RemoveNthNodeFromEnd(head,3);
        traverse(head);
    }
}
