public class AllOperationsOfStack {
    int stack[]=new int[5];
    int top=-1;

    void push(int value){
         if(isFull()){
            System.out.println("Stack is Overflow");
            return;
         }
         top++;
         stack[top]=value;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek(){
        if(isFull()){
            System.out.println("Stack is overflow");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==stack.length-1;
    }
    int size(){
        return top+1;
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        AllOperationsOfStack s=new AllOperationsOfStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
    }
}
