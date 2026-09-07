public class QueueUsingLinkedList {
      class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        Node front;
        Node rear;
        boolean isEmpty(){
           return front==null;
        }
        void enqueue(int value){
            Node newNode=new Node(value);
            if(isEmpty()){
               front=newNode;
               rear=newNode;
            }else{
                rear.next=newNode;
                rear=newNode;
            }
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int value=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return value;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return front.data;
        }
        void display(){
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
      
      public static void main(String[] args) {
        QueueUsingLinkedList q=new QueueUsingLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        q.display();
    }
}

