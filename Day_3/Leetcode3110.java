package Day_3;

public class Leetcode3110 {

    public static int scoreOfString(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            ans = ans + diff;

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = scoreOfString("hello");
        System.out.println(n);

    }
}
