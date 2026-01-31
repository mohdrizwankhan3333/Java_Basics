public class FirstUnique {
    //Find the first non-repeating element in an array.
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4};

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(arr[i] + " is first unique");
                return;
            }
        }
    }
}
