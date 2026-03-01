/*public class DeleteCharactersInString {
    public static void main(String[] args) {
        String s="abcdef";
        StringBuilder sb=new StringBuilder(s);
        sb.deleteCharAt(2);
        System.out.println(sb.toString());
    }
}*/

public class DeleteCharactersInString {
     public static void main(String[] args) {
        String s="banana";
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='a'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
}
