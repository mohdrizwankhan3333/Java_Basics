public class Strin {
    public static void reverse(char[] arr, int l, int r) {
        if (l >= r) return;
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        char[] arr = "rizwan".toCharArray();
        reverse(arr, 0, arr.length - 1);

        for (char c : arr) {

            System.out.print(c);  }
    }
}
