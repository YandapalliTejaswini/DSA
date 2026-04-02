public class NodeAtGivenIndex {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node NodeAtGivenIndex(Node head,int index){
        Node temp=head;
        int count=0;//Count can be either 0 or 1 based on the conditions(ex:0th index-0,1-index,1)
        while(temp!=null){
            if(count==index){
                return temp;
            }
            temp=temp.next;
            count++;
        }
        return null;
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
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
         Node result = NodeAtGivenIndex(head, 3);

        if(result != null)
            System.out.println("Value at index 3: " + result.data);
        else
            System.out.println("Index not found");
    

    }
}
