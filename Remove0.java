public class Remove0 {
    //Move all zeros to the end of an array.
    public static void main(String[] args) {
        int [] arr={1123,0,3,4,5,0,0,4,3,0};
       int index=0;
       for(int i:arr){
           if(i!=0){
               arr[index]=i;
               index++;
           }
        }
       while(index<arr.length){
           arr[index]=0;
           index++;
       }
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
}
