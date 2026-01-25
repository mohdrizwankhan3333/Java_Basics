public class BIt {
       // Is power of two ?
        public static boolean powerOfTwo(int n) {
            if (n <= 0) return false;
            return (n & (n - 1)) == 0;}

    // is n bit 1 or 0?
    public static void nb(int num,int bitNum) {
        System.out.println((num>>bitNum) & 1);
        }
        // How much 1 in (n) with base 10:
    public static  int Oneb(int n){
            int c=0;
            while(n!=0){
                n=n&(n-1);
                c++;
            }
            return c;
    }
    public static void main(String[] args) {
        System.out.println("8 is power of 2? " + powerOfTwo(8));
        System.out.println("10 is power of 2? " + powerOfTwo(10));
        nb(10,1);
        System.out.println("num of 1 is :"+ Oneb(8));
    }
}
