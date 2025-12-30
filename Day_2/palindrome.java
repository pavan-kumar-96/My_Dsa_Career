//A palindrome is a word, phrase, number, or other sequence that reads the same backward as forward, such as "madam" or the number 121. 

public class palindrome {
    public static void main(String[] args) {

        // <!--1st way--!>

        String s = "abccba";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        if (ans.equals(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        // <!-- 2nd way--!>

        String A = "aba";
        int n = A.length();
        boolean palindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
