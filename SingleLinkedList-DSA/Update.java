public class Update {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void Update(Node head,int oldvalue,int newvalue){
        Node temp=head;
        while(temp!=null){
            if(temp.data==oldvalue){
                temp.data=newvalue;
                return;
        }
        temp=temp.next;
    }
       System.out.println("Not found");
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
        System.out.println("Before Updation");
        traverse(head);
        Update(head,20,25);
        System.out.println("After Updation:");
        traverse(head);
    }
}
