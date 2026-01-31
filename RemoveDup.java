public class RemoveDup {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 5,5,5};

        for (int i = 0; i < a.length - 1; i++) { // ✅ stop at length-1
            if (a[i] == a[i + 1]) {
                continue;
            }
            System.out.println(a[i]);
        }

        // ✅ print last element
        System.out.println(a[a.length - 1]);
    }
}
