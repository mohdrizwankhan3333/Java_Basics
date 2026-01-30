public class BS2D {

    // Binary search in a single row
    public static boolean searchInRow(int[] row, int target) {

        int si = 0;
        int ei = row.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (row[mid] == target) {
                return true;
            }
            else if (row[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {11, 12, 13}
        };

        int target = 8;

        int startRow = 0;
        int endRow = mat.length - 1;

        while (startRow <= endRow) {

            int midRow = startRow + (endRow - startRow) / 2;

            if (target >= mat[midRow][0]
                    && target <= mat[midRow][mat[midRow].length - 1]) {

                if (searchInRow(mat[midRow], target)) {
                    System.out.println("Found");
                    return;
                }

            }
            else if (target < mat[midRow][0]) {
                endRow = midRow - 1;
            }
            else {
                startRow = midRow + 1;
            }
        }

        System.out.println("Not found");
    }
}
