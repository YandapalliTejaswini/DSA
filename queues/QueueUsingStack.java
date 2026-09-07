import java.util.Stack;

public class QueueUsingStack {
   Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    void enequeue(int value){
        stack1.push(value);
    }
    int dequeue(){
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.pop();
}
int peek(){
    if(stack1.isEmpty()&&stack2.isEmpty()){
        return -1;
    }
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.peek();
}
public static void main(String[] args) {
    QueueUsingStack q=new QueueUsingStack();
    q.enequeue(10);
    q.enequeue(20);
    q.enequeue(30);
    q.enequeue(40);
System.out.println(q.dequeue()); 
System.out.println(q.peek());
System.out.println(q.dequeue());



}

}
