import static java.lang.Integer.MIN_VALUE;

public class KedansAlgo {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = nums[0];
        int MaxSum = MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];
            MaxSum = Math.max(currentSum, MaxSum);
        }
        if(currentSum<0){
            currentSum = 0;
        }

        System.out.println("Maximum contiguous subarray sum = " + MaxSum);
    }
}
