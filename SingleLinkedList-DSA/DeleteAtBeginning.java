public class DeleteAtBeginning {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node DeleteAtBeginning(Node head){
        if(head==null)
            return null;
        head=head.next;
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
        System.out.println("Before Deletion:");
        traverse(head);
        head=DeleteAtBeginning(head);
        System.out.println("After Deletion:");
         traverse(head);
    }
}
