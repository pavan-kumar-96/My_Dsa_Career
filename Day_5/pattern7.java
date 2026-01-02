//print the following pattern
//      *****
//     *****
//    *****
//   *****
//  *****

package Day_5;

public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 0; m < n; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
