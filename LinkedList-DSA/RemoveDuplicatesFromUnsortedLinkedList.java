public class RemoveDuplicatesFromUnsortedLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node RemoveDuplicatesFromUnsortedLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while(temp.next!=null){
                if(temp.next.data==curr.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            curr=curr.next;
        }
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
        Node head=new Node(5);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node result=RemoveDuplicatesFromUnsortedLinkedList(head);
        traverse(result);

    }
}
