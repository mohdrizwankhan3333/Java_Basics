import java.util.*; // ❌ WRONG: swap from Collections works on List, not int[]

public class Sorting {
//Bubble sort
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+",");
        }
    }
    //Selection Sort
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int smallest=i; //assume first as smallest element index
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest])
                    smallest=j;
            }
        int temp=arr[i];
        arr[i]=arr[smallest];
        arr[smallest]=temp;}
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }

    }

    //Insertion sort
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currentElement=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentElement){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 6, 78};
      //  bubble(arr);
        //selection(arr);
        //insertion(arr);
    }
}
