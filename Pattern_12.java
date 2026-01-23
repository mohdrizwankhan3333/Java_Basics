public class Pattern_12 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pyramid
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

/*
Output
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */