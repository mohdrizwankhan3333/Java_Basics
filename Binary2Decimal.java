public class Binary2Decimal {
    public static void main(String[] args) {
       /*binary to decimal
        int binaryNum=1010101;
        int base=1;
        int decimal=0;
        while(binaryNum>0){
            int rem=binaryNum%2;
            decimal+=rem*base;
            binaryNum=binaryNum/10;
            base*=2;
        }
       System.out.println(decimal);

        Output :
        85
         */


        //decimal to binary
        int myDecimal=85;
        int binaryNow=0;
        int base=1;

        while(myDecimal>0){
            int rem=myDecimal%2;
            binaryNow+=rem*base;
            base=base*10;
            myDecimal=myDecimal/2;
        }
        System.out.println(binaryNow);
    }
}
