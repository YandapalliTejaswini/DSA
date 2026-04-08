public class SortLinkedListOf0s1s2s {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node SortLinkedListOf0s1s2s(Node head){
        int count0=0;
        int count1=0;
        int count2=0;
        Node temp=head;
        while(temp!=null){
           if(temp.data==0){
            count0++;
           }else if(temp.data==1){
            count1++;
           }else{
            count2++;
           }
           temp=temp.next;
        }
        temp=head;
        while(count0-->0){
            temp.data=0;
            temp=temp.next;
        }
        while(count1-->0){
            temp.data=1;
            temp=temp.next;
        }
        while(count2-->0){
            temp.data=2;
            temp=temp.next;
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
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(0);
        head.next.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next.next=new Node(2);
        Node result=SortLinkedListOf0s1s2s(head);
        traverse(result);
    }
}
