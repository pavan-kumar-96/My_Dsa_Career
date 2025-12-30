public class Animuthyam_prb4 {
    public static void main(String[] args) {
        // Return th count of no.of elements divided by both 2 and 3 using
        // "and(&&)","or(||)"
        int arr[] = { 3, 2, 1, 5, 7, 8, 1, 4, 1, 2, 1, 4, 6 };
        int count_or = 0;
        int count_and = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                count_or++;
            }
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                count_and++;
            }
        }
        System.out.println(count_or);
        System.out.println(count_and);
    }
}
