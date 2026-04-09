public class FindIndexForNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static int FindIndexForNode(Node head,int value){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==value){
                 return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
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
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        int result=FindIndexForNode(head,40);
        if(result!=-1)
            System.out.println(result);
        else
            System.out.println("Not Found");

    }
}
