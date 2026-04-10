public class FrequencyInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static int  FrequencyInLinkedList(Node head,int key){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        return count;
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
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        head.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next=new Node(1);
        int result=FrequencyInLinkedList(head,2);
        System.out.println(result);
        
    }
}
