package Queue;

import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack;
    Stack<Integer> queue;

    public StackQueue() {
        stack = new Stack<>();
        queue = new Stack<>();
    }

    public void sort(Stack<Integer> origin, Stack<Integer> sorted) {
        while (!origin.isEmpty()) {
            sorted.push(origin.pop());
        }
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        sort(stack, queue);
        int popValue = queue.pop();
        sort(queue, stack);

        return popValue;
    }

    public int peek() {
        sort(stack, queue);
        int peekValue = queue.peek();
        sort(queue, stack);

        return peekValue;
    }

    public boolean empty() {
        return stack.empty();
    }
}
