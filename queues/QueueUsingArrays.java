public class QueueUsingArrays {
    int queue[];
    int front;
    int rear;
    int size;

    QueueUsingArrays(int size){
        queue=new int[size];
        front=-1;
        rear=-1;
        this.size=size;
    }
    void enequeue(int value){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=value;
    }
    int dequeue(){
        if(front==-1||front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front++;
        return value;
    }
    int peek(){
        if(front==-1||front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }
  boolean isEmpty(){
    return front==-1||front>rear;
  }
  void display(){
    if(front==-1||front>rear){
        System.out.println("Queue is Empty");
        return;
    }
    for(int i=front;i<=rear;i++){
        System.out.println(queue[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    QueueUsingArrays q=new QueueUsingArrays(5);
    q.enequeue(10);
    q.enequeue(20);
    q.enequeue(30);
    q.display();
    System.out.println("Removed: " + q.dequeue());
    System.out.println("Front: " + q.peek());
    q.display();
  }
}
