public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String s="java is very powerful";
        StringBuilder sb=new StringBuilder();
        boolean capitalizetext=true;
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append(c);
                capitalizetext=true;
            }else{
             if(capitalizetext){
                sb.append(Character.toUpperCase(c));
                capitalizetext=false;
            }else{
                sb.append(c);
            }
        }
    }
        System.out.print(sb.toString());
}
}
