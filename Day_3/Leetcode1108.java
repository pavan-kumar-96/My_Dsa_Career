package Day_3;

public class Leetcode1108 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String s = "";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (address.charAt(i) == '.') {
                s = s + "[.]";
            } else {
                s = s + address.charAt(i);
            }
        }
        System.out.println(s);
    }
}
