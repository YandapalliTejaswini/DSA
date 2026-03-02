public class InsertAtPosition {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node InsertAtPosition(int data,int pos,Node head){
        Node newNode=new Node(data);

        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.print("Before insertion:");
        traverse(head);
        head=InsertAtPosition(25,3,head);
        System.out.print("After insertion:");
        traverse(head);

    }
}
