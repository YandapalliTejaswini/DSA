public class RemoveNodeFromLinkedList {
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
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

    static Node RemoveNodeFromLinkedList(Node head){
        head=reverse(head);
        Node curr=head;
        int max=curr.data;
        while(curr!=null&&curr.next!=null){
            if(curr.next.data<max){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                max=curr.data;
            }
        }
        return reverse(head);
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
        Node head=new Node(12);
        head.next=new Node(15);
        head.next.next=new Node(10);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(2);
         head.next.next.next.next.next.next.next=new Node(3);
         Node result=RemoveNodeFromLinkedList(head);
         traverse(result);
    }
}
