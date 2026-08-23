package multithreading;

class Counter {
    private int count = 0;

    // synchronized ensures only one thread can execute increment()
    // at a time, preventing a race condition on the shared count field
    synchronized void increment(){
        count++;
    }

    int getCount(){
        return count;
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i = 0;i<1000;i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: "+counter.getCount());
        // without synchronized, two threads could read the same count
        // value at once and overwrite each other's increment, giving
        // a final count less than 2000
    }
}

// Practice: Remove the synchronized keyword, run the program several
// times, and observe the final count is sometimes less than 2000.
