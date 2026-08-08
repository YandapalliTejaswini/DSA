import java.util.Arrays;

public class DymanicStack {
    private int stack[];
    private int top;

    DymanicStack(){
        top=-1;
        stack=new int[3];
    }
    void push(int value){
        if(top==stack.length-1){
            stack=Arrays.copyOf(stack, stack.length*2);
            System.out.println("Length increased to :"+stack.length);
        }
        top++;
        stack[top]=value;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
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
        DymanicStack s=new DymanicStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.display();
    }
}
