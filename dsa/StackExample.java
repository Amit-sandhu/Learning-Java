import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);

        // Peek (top element without removing)
        System.out.println("Top element: " + stack.peek());

        // Pop (remove top element)
        int removed = stack.pop();
        System.out.println("Removed: " + removed);
        System.out.println("Stack after pop: " + stack);

        // Push another element
        stack.push(40);
        System.out.println("Stack after pushing 40: " + stack);

        // Size
        System.out.println("Size: " + stack.size());

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Remove everything
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack after removing all elements: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}