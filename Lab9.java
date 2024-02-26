class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Lab9 {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared Counter object
        Counter counter = new Counter();

        // Create multiple threads that increment the counter
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
