public class PushOperation {
    int stack[]=new int[5];
    int top=-1;
    void push(int value){
        if(top==stack.length-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top]=value;
            
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PushOperation s=new PushOperation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
    }
}
