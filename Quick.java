package project;

public class Quick {

    // ❌ Your: public static void sort(int arr, int si,int ei)
    public static void sort(int[] arr, int si, int ei) {

        // ❌ You missed base condition
        if (si >= ei) return;

        int pi = partition(arr, si, ei);

        // ❌ Your: sort(arr,si,pi)
        sort(arr, si, pi - 1);

        sort(arr, pi + 1, ei);
    }

    // ❌ Your: non-static method
    public static int partition(int[] arr, int si, int ei) {

        // ❌ Your: idex never used correctly
        int index = si;

        int pivot = arr[ei];

        for (int i = si; i < ei; i++) {

            // ❌ Your: if(arr[i] > pivot)
            if (arr[i] < pivot) {

                // ❌ Your: swapping with arr[ei]
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++; // ❌ You forgot this
            }
        }

        // ❌ You missed final pivot swap
        int temp = arr[index];
        arr[index] = arr[ei];
        arr[ei] = temp;

        return index;
    }

    public static void main(String[] args) {

        // ❌ Your: {1,2-3,-4,5}
        int[] arr = {1, 2, 3, -4, 5};

        sort(arr, 0, arr.length - 1);

        for (int x : arr) System.out.print(x + " ");
    }
}
