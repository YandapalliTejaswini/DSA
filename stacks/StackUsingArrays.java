public class StackUsingArrays {
        int stack[];
        int capacity;
        int top;
        StackUsingArrays(int size){
            capacity=size;
            top=-1;
            stack=new int[size];
        }
        void push(int data){
            if(top==capacity-1){
                System.out.println("Stack is overflow");
                return;
            }
            stack[++top]=data;
        }
        int pop(){
            if(top==-1){
                System.out.println("Stack is underflow");
                return -1;
            }
            return stack[top--];
        }
        int peek(){
            if(top==-1){
                return -1;
            }
            return stack[top];
        }
        boolean isEmpty(){
            return top==-1;
        }
        void display(){
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    

    

    public static void main(String[] args) {
        StackUsingArrays s=new StackUsingArrays(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.display();

    }
}

