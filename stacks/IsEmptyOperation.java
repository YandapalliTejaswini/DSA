public class IsEmptyOperation {
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
        IsEmptyOperation s=new IsEmptyOperation();
        //s.push(10);
        //s.push(20);
        //s.push(30);
        //s.push(40);
        //s.push(50);
        s.display();
        System.out.println(s.isEmpty());
     
    }
}
