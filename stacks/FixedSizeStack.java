public class FixedSizeStack {
        int stack[];
        int capacity;
        int top;
        FixedSizeStack(int size){
            capacity=size;
            top=-1;
            stack=new int[size];
        }
        void push(int value){
            if(top==capacity-1){
                System.out.println("Overflow");
                return;
            }
            top++;
            stack[top]=value;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            return stack[top--];
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return stack[top];
        }
        boolean isEmpty(){
            return top==-1;
        }
        boolean isFull(){
            return top==capacity-1;
        }
        void display(){
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        FixedSizeStack s=new FixedSizeStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
    }
}
