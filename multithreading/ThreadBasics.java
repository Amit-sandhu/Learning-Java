package multithreading;

class CounterThread extends Thread {
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(getName()+" -> "+i);
        }
    }
}

public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();

        // waits for both threads to finish before continuing main
        t1.join();
        t2.join();

        System.out.println("Both threads finished!");
    }
}

// Practice: Run this program a few times and notice the output order
// changes - explain in a comment why that happens.
