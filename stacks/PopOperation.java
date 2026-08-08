public class PopOperation {
    int stack[]=new int[3];
    int top=-1;
    //Push operation
    void push(int value){
        if(top==stack.length-1){
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        stack[top]=value;
    }
    //Pop operation
    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];
    }
    //display
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PopOperation s=new PopOperation();
        s.push(10);
        s.push(100);
        s.push(500);
        s.display();
        System.out.println(s.pop());
        s.display();
    }
}
