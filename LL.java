public class LL {
   private Node head;
    private int size;
    LL(){
        head = null;
        size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add 1st
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        }
        //add at last
        public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next = newNode;
        }

        //print ll
        public void printll() {
            Node temp = head;
            while (temp != null) {          // FIX: correct condition
                System.out.print(temp.data + " -> ");
                temp = temp.next;           // move after printing
            }
            System.out.println("null");
        }

    //remove first
            public void removeFirst() {
                if (head == null) {
                    System.out.println("empty");
                    return;
                }
                head = head.next;   // ✅ only required step
                size--;
            }
            //remove last
            public void removeLast() {

                if (head == null) {
                    System.out.println("empty");
                    return;
                }

                if (head.next == null) {
                    head = null;
                    size--;
                    return;
                }

                Node current = head;
Node lastNode = head.next;
                // stop at second-last node
                while (lastNode.next != null) {
                    current = current.next;
                    lastNode = lastNode.next;
                }

                current.next = null;
                size--;
            }
            //get size
    public int getsize(){
        return size;
    }
//
public void addAtKth(int index, String data) {

    if (index < 0 || index > size) {
        System.out.println("index out of bound");
        return;
    }

    if (index == 0) {          // first position
        addFirst(data);
        return;
    }

    if (index == size) {       // last position
        addLast(data);
        return;
    }

    Node newNode = new Node(data);
    Node current = head;

    // move to (index - 1)
    for (int i = 0; i < index - 1; i++) {
        current = current.next;
    }

    newNode.next = current.next;
    current.next = newNode;
    size++;
}

//search
    public int search(int key){
        Node current = head;
        int index=0;
        while(current!=null){
            if(current.data.equals(key)){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }

    //delete greater then 25
    public void equal234(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        //delete from head
        while(head!=null && head.data.equals("234")){
            head=head.next;
            size--;
        }
        Node current = head;
        //delete from middle or end
        while (current != null && current.next != null) {
            if (current.next.data.equals("234")) {
                current.next = current.next.next; // remove node
                size--;
            } else {
                current = current.next;
            }
        }
    }




    public static void main(String[] args) {
        LL list=new LL();
     list.addFirst("1");
     list.addFirst("2");
     list.addLast("3");
        list.addLast("234");
     list.printll();
     list.removeFirst();
     list.removeLast();
     list.printll();
     list.equal234();
        list.printll();
        list.search(2);
    }
}
