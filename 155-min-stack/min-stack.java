import java.util.Stack;
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        //push the elements in to the main stack
        stack.push(val);
        //now for the minstack i will be adding the values into the min stack only when my new value is smaller than the previous value
        if (minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()){
            return;
        }
        int popped = stack.pop();
        if (popped == minStack.peek()){
            minStack.pop();
        }
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
        if (minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}