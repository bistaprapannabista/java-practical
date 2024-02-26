public class Lab8 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted.");
                    }
                }
            }
        });

        thread.start();
    }
}
