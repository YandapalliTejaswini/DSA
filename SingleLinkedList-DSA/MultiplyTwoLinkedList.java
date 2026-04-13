public class MultiplyTwoLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static long MultiplyTwoLinkedList(Node head1,Node head2){
        long num1=0;
        long num2=0;
        int mod=1000000007;
        while(head1!=null){
            num1=(num1*10+head1.data)%mod;
            head1=head1.next;
        }
        while(head2!=null){
            num2=(num2*10+head2.data)%mod;
            head2=head2.next;
        }
        return (num1*num2)%mod;
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
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);

        Node head2=new Node(4);
        head2.next=new Node(5);
        System.out.println(MultiplyTwoLinkedList(head1, head2));
    }
}
