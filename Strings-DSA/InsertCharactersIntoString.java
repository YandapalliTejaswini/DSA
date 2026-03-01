public class InsertCharactersIntoString {
     public static void main(String[] args) {
        String s="abcd";
        int index=2;
        char c='X';
        StringBuilder sb=new StringBuilder(s);
         sb.insert(index,c);
         System.out.println(sb.toString());
    }
}
