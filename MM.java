public class MM {

    public static void minMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {

            // ✅ Fix: exclude min
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i != min && i < secondMin) {
                secondMin = i;
            }

            // ❌ Your mistake: allowed duplicate max
            // if (i > max) { secondMax = max; max = i; }
            // else if (i > secondMax) { secondMax = i; }

            // ✅ Fix: exclude max
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i != max && i > secondMax) {
                secondMax = i;
            }
        }

        // Edge case check
        if (secondMin == Integer.MAX_VALUE || secondMax == Integer.MIN_VALUE) {
            System.out.println("Second min/max not found");
            return;
        }

        System.out.println(
                "min = " + min +
                        "\nsecond min = " + secondMin +
                        "\nmax = " + max +
                        "\nsecond max = " + secondMax
        );
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 2, 9, 0, 8};
        minMax(arr);
    }
}
