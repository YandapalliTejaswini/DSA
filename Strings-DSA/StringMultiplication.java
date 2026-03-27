import java.util.*;

public class StringMultiplication {

    public static String MultiplyTwoStrings(String s1, String s2) {
        
        // Step 1: Handle sign
        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }

        // Step 2: Remove leading zeros
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

        if (s1.length() == 0 || s2.length() == 0)
            return "0";

        int n = s1.length();
        int m = s2.length();

        int[] result = new int[n + m];

        // Step 3: Multiply
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Step 4: Build result
        StringBuilder sb = new StringBuilder();

        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        String ans = sb.length() == 0 ? "0" : sb.toString();

        // Step 5: Add sign
        if (negative && !ans.equals("0"))
            return "-" + ans;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String s2 = sc.nextLine();

        String result = MultiplyTwoStrings(s1, s2);

        System.out.println("Product: " + result);

        sc.close();
    }
}