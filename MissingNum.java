public class MissingNum {

    public static int findMissing(int[] arr, int N) {
        int sum = N * (N + 1) / 2; // sum of 1..N
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return sum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 missing
        int N = 6;
        System.out.println(findMissing(arr, N)); // Output: 3
    }
}
