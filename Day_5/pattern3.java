//print the following pattern
// *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*

package Day_5;

public class pattern3 {
    public static void main(String[] args) {
        int r = 3;
        int c = 20;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j != c - 1) {
                    System.out.print("*_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
