public class SumOfLastNNodes {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static int SumOfLastNNodes(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int sum=0;
        while(slow!=null){
            sum+=slow.data;
            slow=slow.next;
        }
        return sum;
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
        Node head=new Node(5);
        head.next=new Node(9);
        head.next.next=new Node(6);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(10);
        System.out.println(SumOfLastNNodes(head, 03));
    }
}
