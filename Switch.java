import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        System.out.println("Welcome to the switch\n enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
