public class SS{

    //2ND FOUND
    public static void main(String[] args) {
        String arr="rizrwanR";
        char key='r';
        int c=0;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)==key){
                ++c;
            }
            if(c==2){
                System.out.println(arr.charAt(i)+" at index: "+(i));
                return;
            }
        }
        System.out.println("NOt found key-> "+ key  );
    }
}