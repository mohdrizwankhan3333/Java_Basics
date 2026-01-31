public class LargestSum {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int cs = 0;
            for (int j = i; j < nums.length; j++) {
                cs += nums[j];
                maxSum = Math.max(cs, maxSum);
            }
        }

        System.out.println(maxSum); // Output: 6
    }
}
