public class IdenticalLinkedList {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static boolean IdenticalLinkedList(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=null&&temp2!=null){
            if(temp1.data!=temp2.data)
                return false;
            
            temp1=temp1.next;
            temp2=temp2.next;    
            }
            return (temp1==null&&temp2==null);
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

            Node head2=new Node(1);
            head2.next=new Node(2);
            head2.next.next=new Node(5);
          System.out.println(IdenticalLinkedList(head1,head2));

        }
    }

