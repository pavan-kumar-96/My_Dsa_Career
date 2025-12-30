public class Animuthyam_prb3 {
    public static void main(String[] args) {
        // Return the count of number of elements is divided by 3
        int arr[] = { 5, 4, 6, 12, 2 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
