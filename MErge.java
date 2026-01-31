import java.util.Arrays;

public class MErge {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        // ❌ your code: int[] merged = {};
        int[] merged = new int[a.length + b.length]; // ✅ must allocate size

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k] = a[i]; // ✅ assign first
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++; // ✅ increment after assignment
        }

        // ❌ your code: missing leftover elements logic
        while (i < a.length) {
            merged[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            merged[k] = b[j];
            j++;
            k++;
        }

        for (int val : merged) {
            System.out.print(val + " ");
        }
    }
}
