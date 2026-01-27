public class Rec_2 {
  /* public static void rec(int n){
       if(n==0)
           return ;
       System.out.println(n);
       rec(n-1);
   }
   public static void rec(int n,int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum+=n;
        rec(n-1,sum);

    }*/
//    public static int rec(int n){
//        if(n<=1){
//            return 1;}
//
//    return rec(n-1)*n;
//    }

//    public static void fib(int n,int a,int b){
//        if(n==0) return;
//        System.out.println(a);
//        fib(n-1,a+b,a);
//    }
    public static int printPow(int n,int power){
        if(power ==0){
            return 1;
        }
        return n*(printPow(n,power-1));
    }
    public static void main(String[] args) {

        System.out.println(printPow(2,3));
    }
}
