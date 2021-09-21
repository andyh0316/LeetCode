package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafety {
    int count1;
    int count2;
    AtomicInteger count3 = new AtomicInteger();

    public void incrementCount1() {
        // not thread safe
        // for example, before thread1 has incremented count and saved it back into count, in between thread2 could still have the old value count. 
        // thread1 and thread2 could access at the same value of count 100 at the same time, and both increment it but the end result is 101 (instead of 102)
        count1 = count1 + 1;
    }

    public synchronized void incrementCount2() {
        // thread safe
        // synchronized keyword guarantees that only one thread can access this method at a time
        count2 = count2 + 1;
    }

    public void incrementCount3() {
        // thread safe
        count3.incrementAndGet();
    }
}