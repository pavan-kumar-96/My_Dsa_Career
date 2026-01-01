public class Leetcode2114 {
    public static void main(String[] args) {
        int ans = 0;
        String sentences[] = { "please wait", "continue to fight", "continue to win" };
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int temp = 1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    temp++;
                }
                ans = Math.max(ans, temp);
            }
        }
        System.out.println(ans);
    }
}
