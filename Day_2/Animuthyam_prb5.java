public class Animuthyam_prb5 {
    public static void main(String[] args) {
        // reversing of a string
        String s = "Chapri";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            // System.out.println(s.charAt(i));
            // System.out.print(s.charAt(i));
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);

    }
}
