public class PeekOperation {
    int stack[]=new int[5];
    int top=-1;
    //push operation
    void push(int value){
        if(top==stack.length-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top]=value;
    }
    //peek operation:return top element without removing it
    int peek(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        return stack[top];
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PeekOperation s=new PeekOperation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println(s.peek());
    }
}
