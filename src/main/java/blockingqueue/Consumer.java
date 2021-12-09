package blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicLong;

public class Consumer extends Executor {

    public Consumer(BlockingQueue<Integer> blockingQueue, int count, CyclicBarrier cyclicBarrier, AtomicLong atomicLong) {
        super(blockingQueue, count, cyclicBarrier, atomicLong);
    }

    public void doExecute(AtomicLong checker) {
        try {
            while (count -- > 0) {
                checker.addAndGet(-bq.take());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
