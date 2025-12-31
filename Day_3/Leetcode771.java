package Day_3;

public class Leetcode771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
