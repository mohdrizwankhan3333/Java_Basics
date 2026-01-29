import java.util.*;

class Q {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    void add(int x) {
        in.push(x);
    }

    int remove() {
        shift();
        return out.pop();
    }

    int peek() {
        shift();
        return out.peek();
    }

    boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    void shift() {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
    }
}
