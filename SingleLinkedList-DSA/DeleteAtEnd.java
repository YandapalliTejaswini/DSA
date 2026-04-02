public class DeleteAtEnd {
    static class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static Node DeleteAtEnd(Node head){
        if(head==null||head.next==null)
            return null;

         Node temp=head;

        while(temp.next.next!=null)
            temp=temp.next;

        temp.next=null;
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
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Before deletion:");
        traverse(head);
        head=DeleteAtEnd(head);
        System.out.println("After deletion:");
        traverse(head);
    }
}
