
//this is insert efficient queue
import java.util.Stack;
public class MyQueue {
    //it is given in the problem that we are given with the 2 stacks
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        //insertion in the stack and queue is same
        first.add(x);
    }

    public int pop(){
        //the removal in stack and queue is different, in STACK it is LIFO and in QUEUE it is FIFO
        if (first.isEmpty()){
            return -1;
        }
        //this is the wrong approach, as you are incrementing the i by 1 in every loop and stack is updating its size, there will be a point when i > stacksize
        //and hence wont be able to remove the element from the stack, it is not the array that the size will remain constant
//        for (int i = 0; i < first.size(); i++) {
//            second.push(first.pop());
//        }
        while (!first.isEmpty()){
            //remove the elements from the stack, and add it into the second stack
            second.add(first.pop());
        }
        int removed = second.pop();

        //we cannot change the structure of the stack so aft returning the targeted element from the we have to make it same
        while (!second.isEmpty()){
            first.add(second.pop());
        }
        //now the second stack is containing the all the elements from it in the stack format but the elements will be removed in the queue format
        return removed;
    }

    public int peek() {
        //in queue peek element is the element which will be removed 1st
        //In queue the 1st element which will removed will at the bollom of the stack
        //to return this we have to make it on the top, and when we perform the stack operation the elements will be removed in the queue order

        //everytime you have to add the condition otherwize error will occur
        if (first.isEmpty()){
            return -1;
        }

        while (!first.isEmpty()){
            //start removing the elements fromm the stack from the 1st queue and add it into the second stack
            second.add(first.pop());
        }
        //now the top element is the second stack is the bottom most element of the stack
        int peek = second.peek();
        while (!second.isEmpty()){
            first.add(second.pop());
        }
        return peek;
    }

    public boolean empty() {
        //this is already present in the stack so we can use them
        return first.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */