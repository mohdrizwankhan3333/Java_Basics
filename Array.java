import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int [] array=new int[5];
//        System.out.println("Enter 5 integers:");
//        for(int i=0;i<5;i++){
//            Scanner sc=new Scanner(System.in);
//            array[i]=sc.nextInt();}
//        for(int i=0;i<5;i++){
//            System.out.println("hello"+array[i]);
//        }

//        int [] array={1,2,3,4,5};
//        for(int x=0;x<array.length;x++){
//            System.out.println(array[x]);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to be searched:");
        int key=sc.nextInt();
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int[] array = new int[n]; // FIX 1: allocate

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of index: " + i);
            array[i] = sc.nextInt();
        }

        System.out.println("want to print array : Press 1");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                for (int i = 0; i < n; i++) { // FIX 2: use n, not 5
                    System.out.println(array[i]);
                }
                break;

            case 2:
                System.out.println("Welcome at 2");
                break;

            default:
                System.out.println("Invalid input");
        }


boolean found=false;
    for(int i=0;i<n;i++){
        if(key==array[i]){
            System.out.println("founded at :"+i);
            found=true;
            break;

        }}
    if(!found){
        System.out.println("not found");


    }}}


