public class tooD {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int key = 5;

        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // cols
                if (arr[i][j] == key) {
                    System.out.println(key + " found at (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not found key -> " + key);
    }
}
