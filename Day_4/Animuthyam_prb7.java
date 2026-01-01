public class Animuthyam_prb7 {

    // Return maximum number of the array
    public static void main(String[] args) {
        int arr[] = { 5, 8, 10, 11, 50, 15, 20, 25 };
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);
    }
}