import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collect {
    public static void main(String[] args) {
        Queue<String> arr = new LinkedList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(arr );
        arr.addAll(Arrays.asList("1,","2"));
        System.out.println(arr);
        arr.iterator().forEachRemaining(System.out::println);
    }
}
