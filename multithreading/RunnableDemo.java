package multithreading;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {

        // implementing Runnable is preferred over extending Thread
        // because your class can still extend something else too
        Runnable task = () -> {
            for(int i = 1;i<=3;i++){
                System.out.println(Thread.currentThread().getName()+" is running step "+i);
            }
        };

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

// Practice: Create a Runnable that prints the square of numbers 1 to 5,
// and run it on two separate threads.
