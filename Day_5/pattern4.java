//print the following the pattern
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*
// *-*-*

package Day_5;

public class pattern4 {
    public static void main(String[] args) {
        int r = 20;
        int c = 3;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j != c - 1) {
                    System.out.print("*-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
