import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lis {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("a");
        arr.add("b");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr.get(2));
        System.out.println(arr.get(1));
        arr.add(1,"rime");
        System.out.println(arr.get(3)+" 3rd index");

        System.out.println("index 1 is now"+arr.get(1));
        arr.set(3,"time");
        System.out.println(arr.get(3)+" current 3rd index");
        System.out.println(arr);
        System.out.println(arr.size());

    }
}
