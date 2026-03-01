public class InPlaceModificationUSingArray {
    public static void main(String[] args) {
        String s="hello world";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                arr[i]='%';
            }
        }
        String result=new String(arr);
       System.out.println(result);
    }
}
