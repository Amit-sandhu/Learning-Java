package collections;

import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueDemo {
    public static void main(String[] args){

        // by default, a PriorityQueue is a min-heap: the smallest
        // element is always polled out first
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(10);
        minHeap.add(30);

        System.out.println(minHeap.peek());

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }

        // passing Collections.reverseOrder() turns it into a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(30);

        System.out.println(maxHeap.poll());
    }
}

// Practice: Use a min-heap PriorityQueue to find the 3 smallest
// numbers in an int[] array.
