package stacks_queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){

        // Queue is First-In-First-Out (FIFO), the opposite ordering of a Stack
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue);
        System.out.println("Front: "+queue.peek());

        System.out.println("Served: "+queue.poll());
        System.out.println(queue);
    }
}

// Practice: Use two Stacks to implement Queue-like FIFO behaviour
// (a classic interview question - "implement a queue using two stacks").
