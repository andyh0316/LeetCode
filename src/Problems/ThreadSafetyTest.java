package Problems;

public class ThreadSafetyTest {
    public static void start() throws Exception {
        ThreadSafety threadSafety = new ThreadSafety();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    threadSafety.incrementCount1();
                    threadSafety.incrementCount2();
                    threadSafety.incrementCount3();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    threadSafety.incrementCount1();
                    threadSafety.incrementCount2();
                    threadSafety.incrementCount3();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // join wait for this thread to die
        thread2.join();

        System.out.println(threadSafety.count1); // not 2000: its not thread safe
        System.out.println(threadSafety.count2); // 2000: thread safe
        System.out.println(threadSafety.count3); // 2000: thread safe
    }
}