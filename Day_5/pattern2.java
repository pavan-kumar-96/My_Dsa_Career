//print th following pattern
// *_*_*_*_*
// *_*_*_*_*
// *_*_*_*_*
// *_*_*_*_*
// *_*_*_*_*

package Day_5;

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != n - 1) {
                    System.out.print("*_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
