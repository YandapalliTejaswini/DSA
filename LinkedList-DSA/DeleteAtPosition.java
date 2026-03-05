public class DeleteAtPosition {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node DeleteAtPosition(Node head,int pos){
        if(head==null)
            return null;
        Node temp=head;

        if(pos==1)
            return head.next;

        for(int i=1;i<pos-1;i++)
            temp=temp.next;

            temp.next=temp.next.next;
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
            System.out.println("Before Deletion");
            traverse(head);
            head=DeleteAtPosition(head,3);
            System.out.println("After Deletion:");
            traverse(head);
        }
}
