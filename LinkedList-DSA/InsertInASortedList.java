public class InsertInASortedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node InsertInASortedList(Node head,int key){
        Node newNode=new Node(key);
        if(head==null||key<head.data){
            newNode.next=head;
            return newNode;
        }
        Node curr=head;
        while(curr.next!=null&&curr.next.data<key){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
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
        Node head=new Node(50);
        head.next=new Node(100);
        Node result=InsertInASortedList(head,75);
        traverse(result);
    }
}
