public class MergeTwoSortedLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node MergeTwoSortedLinkedList(Node head1,Node head2){
        Node dummy=new Node(0);
        Node tail=dummy;
        while(head1!=null&&head2!=null){
        if(head1.data<=head2.data){
            tail.next=head1;
            head1=head1.next;
        }else{
            tail.next=head2;
            head2=head2.next;
        }
        tail=tail.next;
    }
    if(head1!=null){
        tail.next=head1;
    }
    if(head2!=null){
        tail.next=head2;
    }
    return dummy.next;
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
        head1.next=new Node(3);
        head1.next.next=new Node(5);

        Node head2=new Node(2);
        head2.next=new Node(4);
        head2.next.next=new Node(6);

        Node merged=MergeTwoSortedLinkedList(head1,head2);
        traverse(merged);

    }

}
