public class LS{
    public static void main(String[] args) {
        int [] arr={1,5,3,2,-1};
        int key=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(arr[i]+" at index: "+(i));
                return;
            }
        }
        System.out.println("NOt found key-> "+ key  );
    }
}