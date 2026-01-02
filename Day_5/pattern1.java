//print the followong pattern
// *_*_*_*_*_
// *_*_*_*_*_
// *_*_*_*_*_
// *_*_*_*_*_
// *_*_*_*_*_

package Day_5;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.print("*_");
            }
            System.out.println("");
        }
    }
}
