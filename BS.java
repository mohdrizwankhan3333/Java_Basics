import java.io.FilterOutputStream;

public class BS {
    public static int recBS(int [] arr,int si,int ei,int target){
        if(si>ei)
            return -1;
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){return mid;}
        else if(arr[mid]>target){
            return recBS(arr,si,mid-1,target);
        }
        else{
            return recBS(arr,mid+1,ei,target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 2;
        int si = 0, ei = arr.length - 1;
        int position=recBS(arr,si,ei,target);
if(position!=-1){
    System.out.println("Found "+ arr[position]+" at -> "+position);
    return;
}

        System.out.println("Not found");
    }
}
