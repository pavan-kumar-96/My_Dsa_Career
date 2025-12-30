public class Animuthyam_prb2 {
    public static void main(String[] args) {
        // Return the count of number of 1's in the array
        int arr[] = { 3, 2, 1, 0, 9, 8, 3, 1, 0, 1, 2, 1, 2 };
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);

    }
}