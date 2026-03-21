public class FirstRepeatingCharacters {
    public static void main(String[] args) {
        String s="tejaswini";
        boolean[] seen=new boolean[256];
        for(char c:s.toCharArray()){
            if(seen[c]){
                System.out.println("First repaeating character:"+c);
                break;
            }
            seen[c]=true;
        }
    }
}
