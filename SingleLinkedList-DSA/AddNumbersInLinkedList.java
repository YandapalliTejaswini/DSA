public class AddNumbersInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node AddNumbersInLinkedList(Node head1,Node head2){
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummy=new Node(0);
        Node temp=dummy;
        int carry=0;
        while(head1!=null||head2!=null||carry!=0){
            int sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }
        Node result=reverse(dummy.next);
        while(result!=null&&result.data==0&&result.next!=null){
            result=result.next;
        }
        return result;
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

        Node head2=new Node(9);
        head2.next=new Node(9);
        head2.next.next=new Node(9);
        Node result=AddNumbersInLinkedList(head1, head2);
        traverse(result);
    }
}

