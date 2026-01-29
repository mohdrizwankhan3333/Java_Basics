import java.util.ArrayList;

public class ArrayLL {
    static class stack{
        ArrayList <Integer>list = new ArrayList<>();
        public void push(int x){
            list.add(x);
        }
        public boolean isEmpty(){
            return list.isEmpty();
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public int pop(){
            return list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
