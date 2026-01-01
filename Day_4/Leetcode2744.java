public class Leetcode2744 {

    public static String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String words[] = { "cd", "ac", "dc", "ca", "zz" };
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            String a = words[i];
            if (a.equals("0")) {
                break;
            }
            for (int j = i + 1; j < words.length; j++) {
                String b = words[j];
                String revb = rev(b);
                if (revb.equals(a)) {
                    ans++;
                    words[j] = "0";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
