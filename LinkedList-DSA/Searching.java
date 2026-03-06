public class Searching {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static boolean Searching(Node head,int key){                  /* static int searchPosition(Node head, int key){

                                                                    Node temp = head;
                                                                       int position = 1;
                                                                       while(temp != null){

                                                                        if(temp.data == key)
                                                                        return position;

                                                                       temp = temp.next;
                                                                            position++;
                                                                          }

                                                                      return -1; // not found
                                                                        }*/
       Node temp=head;
        while(temp!=null){
            if(temp.data==key)
                return true;
            temp=temp.next;
        }
        return false;

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
        traverse(head);
        int key=30;
        if(Searching(head, key))
            System.out.println(key+" Found");
        else
            System.out.println(key+"Not Found");
    }
}
