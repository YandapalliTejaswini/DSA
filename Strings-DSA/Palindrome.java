public class Palindrome {
    public static void main(String[] args) {
        String s="madaM";
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println("Palindrome:"+s+","+rev);
        }
        else{
            System.out.println("Not a palindrome:"+s+","+rev);
        }
    }
}
