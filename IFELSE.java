import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args){
        System.out.println("Enter a:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>23){
            System.out.println("Greater then 23");
        }
        else{
            System.out.println("Not Greater then 23");
        }
    }
}
