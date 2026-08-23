package stacks_queues;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);
        System.out.println("Top element: " + stack.peek());

        int removed = stack.pop();
        System.out.println("Removed: " + removed);
        System.out.println("Stack after pop: " + stack);

        stack.push(40);
        System.out.println("Stack after pushing 40: " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack after removing all elements: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

// Practice: Use two stacks to reverse a String without using
// StringBuilder.reverse().
