public class ndFromLast {
    public static void main(String[] args) {
        String arr = "rizrawanR";
        char key = 'a';
        int c = 0;

        for (int i = arr.length() - 1; i >= 0; i--) {
            if (arr.charAt(i) == key) {
                c++;
                if (c == 2) {
                    System.out.println(key + " at index: " + i);
                    return;
                }
            }
        }
        System.out.println("Not found key -> " + key);
    }
}
