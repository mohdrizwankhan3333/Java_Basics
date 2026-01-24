import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] twoDArray = new int[2][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter key to be searched:");
        int key = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter value at index [" + i + "][" + j + "]:");
                twoDArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values of 2D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        boolean found = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) { // FIX: 4, not 3
                if (key == twoDArray[i][j]) {
                    System.out.println("Found at: [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
