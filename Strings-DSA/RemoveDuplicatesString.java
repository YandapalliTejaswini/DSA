public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String s="madam";
        //To store result
        StringBuilder sb=new StringBuilder();
        //To keep track of seen characters
        boolean[] seen=new boolean[256];
        //Traverse the string
        for(char c:s.toCharArray()){
            //If character is not seen before append it to result
            if(!seen[c]){
                sb.append(c);
                seen[c]=true;
            }
        }
        System.out.println("Original string:"+s);
        System.out.println("After removing duplicates:"+sb.toString());
    }
}
