public class RemoveLoop {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static boolean DetectLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    static void removeLoop(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        slow=head;
        while(slow!=fast){
              slow=slow.next;
              fast=fast.next;
        }
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;

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
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head.next;
        System.out.println("Loop Detected:"+DetectLoop(head));
        removeLoop(head);
        System.out.println("Loop detected after removal:"+DetectLoop(head));
        traverse(head);
    }

}
