public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending numbers (start from 2 to avoid duplicate 1)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
}}
