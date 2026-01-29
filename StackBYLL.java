
public class StackBYLL {
    public static class Node{
        Node next;
        String data;
         Node(String data){
            this.data=data;
            next=null;
        }
    }
    public static Node head=null;
    //empty or not
    public static boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;

    }
    //pop
    public static String pop(){
        if(isEmpty()){
            return "Empty Stack";
        }
        Node temp=head;
        head=head.next;
        return temp.data;
    }

    //push
    public static void push(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //peek
    public static String peek(){
        if(isEmpty()){
            return "Empty Stack";
        }
        Node top=head;
        return top.data;
    }

    public static void main(String[] args) {
        push("1");
        push("2");
        push("3");
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(peek());
        push("4");
        System.out.println(peek());

    }
}
