public class FindNthNodeFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node FindNthNodeFromEnd(Node head,int n){
        Node first=head;
        Node second=head;
        for(int i=0;i<n;i++){
            if(first==null)
                return null;
            first=first.next;
        }

        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second;
    }
    static void traverse(Node head){
        Node temp=null;
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
        Node result=FindNthNodeFromEnd(head,2);
        System.out.print(result.data);

    }
}
