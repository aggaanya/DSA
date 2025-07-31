import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        //this will the function that will be pushing the elements in the constant time
        stack.push(val);
    }

    public void pop() {
        //if my stack ias empty it will give me an error, hence
        if (stack.isEmpty()){
            return;
        }
        stack.pop();
    }

    public int top() {
        //this is the function that will return the top most element
        if (stack.isEmpty()){
            return -1;
        }
        //return the top element
        return stack.peek();
    }

    public int getMin() {
        //this is the additional function that the priblem have
        //the stack only have pop, peek, remove etc
        if (stack.isEmpty()){
            return -1;
        }
        List<Integer> list = new ArrayList<>(stack);
        int ans = Integer.MAX_VALUE;
        for (Integer integer : list) {
            ans = Math.min(integer, ans);
        }
        return ans;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */