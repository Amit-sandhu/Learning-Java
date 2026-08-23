package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){

        // LinkedList implements both List and Deque, so it's great
        // for fast insertion/removal at both ends
        LinkedList<Integer> queue = new LinkedList<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addFirst(0);

        System.out.println(queue);

        System.out.println(queue.peekFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        queue.addLast(4);
        System.out.println(queue);
    }
}

// Practice: Use a LinkedList as a Deque to check if a sequence of
// numbers reads the same forwards and backwards (a palindrome check).
