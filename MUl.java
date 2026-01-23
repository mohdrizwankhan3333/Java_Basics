public class MUl {
    public static int mul(int a){
        if(a<=1)
            return 1;
    return mul(a-1)*a;
    }
    public static void main(String[] args) {
        System.out.println( mul(6));
    }
}
