public class ReplaceSpacesWithValueInAStringUSingInPlace {
    public static void main(String[] args) {
        String s="Tejaswini Reddy Yandaapli";
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        for(char c:arr){
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
