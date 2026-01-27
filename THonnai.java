public class THonnai {

    static int callCount = 0;  // global counter

    public static void th(int n, char src, char aux, char dest) {
        callCount++;  // increment on every call

        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;  // ❌ must return here
        }

        th(n - 1, src, dest, aux);  // move n-1 disks to aux
        System.out.println(src + " -> " + dest);  // move nth disk
        th(n - 1, aux, src, dest);  // move n-1 disks to dest
    }

    public static void main(String[] args) {
        int n = 3; // change to 10 if needed
        th(n, 'A', 'B', 'C');
        System.out.println("Total recursive calls: " + callCount);
    }
}
