public class CircularQueue {
    int queue[];
    int front;
    int rear;
    int size;
CircularQueue(int size){
    this.size=size;
    front=-1;
    rear=-1;
    queue=new int[size];
}
boolean isEmpty(){
    return front==-1;
}
boolean isFull(){
    return (rear+1)%size==front;
}
void enequeue(int value){
    if(isFull()){
        System.out.println("Queue is full");
        return;
    }
    if(isEmpty()){
        front=0;
        rear=0;
    }else{
        rear=(rear+1)%size;
    }
    queue[rear]=value;
}
int dequeue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    int value=queue[front];
    if(front==rear){
        front=-1;
        rear=-1;
    }else{
        front=(front+1)%size;
    }
    return value;
}
int peek(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    return queue[front];
}
void display(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return;
    }
   int i=front;
   while(true){
    System.out.println(queue[i]+" ");
    if(i==rear){
        break;
    }
    i=(i+1)%size;
   }
   System.out.println();
}
public static void main(String[] args) {
    CircularQueue q=new CircularQueue(3);
    q.enequeue(10);
    q.enequeue(20);
    q.enequeue(30);
    q.display();
    System.out.println(q.dequeue());
    System.out.println(q.peek());
    q.display();
}
}
