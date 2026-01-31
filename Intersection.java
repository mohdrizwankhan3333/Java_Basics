// Time: O(n log n) | Space: O(1) (excluding output)
import java.util.*;
//Find the intersection of two arrays.
public class Intersection {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        int i = 0, j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++; j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
