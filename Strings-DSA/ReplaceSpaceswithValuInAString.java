//Time complexity:O(n),space complexity:O(n)

public class ReplaceSpaceswithValuInAString{
    public static void main(String[] args) {
        String s="tejaswini Reddy";
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
        }else{
            sb.append(c);
        }
    }
    System.out.println(sb.toString());
}
}
