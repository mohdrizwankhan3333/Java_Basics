public class Rotate {
    public static void reverse(int[] arr,int si,int ei) {
        while(si<=ei){
            int temp=arr[si];

            arr[ei]=temp;
            si++;ei--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,78,455,56,4,5,6,7};
        int position=3;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,position-1);

        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
